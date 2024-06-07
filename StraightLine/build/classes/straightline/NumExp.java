package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class NumExp extends Exp{
    public int num;
    public NumExp(int n){
        num=n;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
