package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class IdExp extends Exp{
    public String id;
    public IdExp(String i){
        id=i;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
