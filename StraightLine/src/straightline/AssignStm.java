package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class AssignStm extends Stm{
    public IdExp id; public Exp exp;
    public AssignStm(IdExp i, Exp e){
        id=i; exp=e;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
