package straightline;

/**
 *  Author: Dayton McManus
 *  
 */
public class PairExpList extends ExpList{
    public Exp head;
    public ExpList tail;
    public PairExpList(Exp h, ExpList t){
        head=h;
        tail=t;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
