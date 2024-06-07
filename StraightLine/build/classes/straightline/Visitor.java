package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public abstract class Visitor {
    public void visit(CompoundStm stm) {
        stm.stm1.accept(this);
        stm.stm2.accept(this);
    }
    
    public void visit(AssignStm stm) {
        stm.id.accept(this);
        stm.exp.accept(this);
    }
    
    public void visit(PrintStm stm) {
        stm.exps.accept(this);
    }
    
    public void visit(EseqExp exp) {
        exp.stm.accept(this);
        exp.exp.accept(this);
    }
    
    public void visit(OpExp exp) {
        exp.left.accept(this);
        exp.right.accept(this);
    }
    
    public void visit(IdExp exp) {}
    
    public void visit(NumExp exp) {}
    
    public void visit(PairExpList expList) {
        expList.head.accept(this);
        expList.tail.accept(this);
    }
    
    public void visit(LastExpList expList) {
        expList.head.accept(this);
    }
}
