package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class CompoundStm extends Stm{
    public Stm stm1, stm2;
    public CompoundStm(Stm s1, Stm s2){
        stm1=s1; stm2=s2;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
