package straightline;

import java.util.HashMap;

/**
 *  Author: Dayton McManus
 *  
 */

public class SymbolVisitor extends Visitor {
    private String nextId = "";
    private int nextNum = 0;
    
    private HashMap<String, Integer> sT = new HashMap();
    
    @Override
    public void visit(AssignStm stm) {
        stm.id.accept(this);
        
        String id = nextId;
        nextId = "";
        
        stm.exp.accept(this);
        
        int num = nextNum;
        nextNum = 0;
        
        sT.put(id, num);
    }
    
    @Override
    public void visit(IdExp exp) {
        nextId = exp.id;
    }
    
    @Override
    public void visit(OpExp exp) {
        int leftNum = 0;
        int rightNum = 0;
        
        exp.left.accept(this);
        
        if (exp.left instanceof IdExp) {
            leftNum = sT.get(nextId);
            nextId = "";
        } else {
            leftNum = nextNum;
            nextNum = 0;
        }
        
        exp.right.accept(this);
        
        if (exp.right instanceof IdExp) {
            rightNum = sT.get(nextId);
            nextId = "";
        } else {
            rightNum = nextNum;
            nextNum = 0;
        }
        
        nextNum = calcOpExp(leftNum, rightNum, exp.oper);
    }
    
    private int calcOpExp(int left, int right, int oper) {
        int num = 0;
        
        if (oper == OpExp.Plus) num = left + right;
        if (oper == OpExp.Minus) num = left - right;
        if (oper == OpExp.Times) num = left * right;
        if (oper == OpExp.Div) num = left / right;
        
        return num;
    }
    
    public void print() {
        for (String name: sT.keySet()) {
            String key = name.toString();
            String value = sT.get(name).toString();
            System.out.println(key + " = " + value);
        }
    }
    
    @Override
    public void visit(NumExp exp) {
        nextNum = exp.num;
    }
    
}
