package straightline;

/**
 *  Author: Dayton McManus
 * 
 */

public class PrintStm extends Stm{
    public ExpList exps;
    public PrintStm(ExpList e){
        exps=e;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
