package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class PrettyPrintVisitor extends Visitor{
    
    @Override
    public void visit(CompoundStm stm) {
        stm.stm1.accept(this);
        System.out.print(";\n");
        stm.stm2.accept(this);
    }
    
    @Override
    public void visit(AssignStm stm) {
        stm.id.accept(this);
        System.out.print(" := ");
        stm.exp.accept(this);
    }
    
    @Override
    public void visit(PrintStm stm) {
        System.out.print("print(");
        stm.exps.accept(this);
        System.out.print(")");
    }
    
    @Override
    public void visit(EseqExp exp) {
        System.out.print("(");
        exp.stm.accept(this);
        System.out.print(", ");
        exp.exp.accept(this);
        System.out.print(")");
    }
    
    @Override
    public void visit(OpExp exp) {
        exp.left.accept(this);
        if (exp.oper == OpExp.Plus) System.out.print(" + ");
        if (exp.oper == OpExp.Minus) System.out.print(" - ");
        if (exp.oper == OpExp.Times) System.out.print(" * ");
        if (exp.oper == OpExp.Div) System.out.print(" / ");
        exp.right.accept(this);
    }
    
    @Override
    public void visit(IdExp exp) {
        System.out.print(exp.id);
    }
    
    @Override
    public void visit(NumExp exp) {
        System.out.print(exp.num);
    }
    
    @Override
    public void visit(PairExpList expList) {
        expList.head.accept(this);
        System.out.print(", ");
        expList.tail.accept(this);
    }
    
    @Override
    public void visit(LastExpList expList) {
        expList.head.accept(this);
    }
    
}
