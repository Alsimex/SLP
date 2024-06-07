package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class EseqExp extends Exp{
    public Stm stm;
    public Exp exp;
    public EseqExp(Stm s, Exp e){
        stm=s;
        exp=e;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
