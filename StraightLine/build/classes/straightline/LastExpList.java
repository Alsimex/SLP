package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class LastExpList extends ExpList{
    public Exp head;
    public LastExpList(Exp h){
        head=h;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
