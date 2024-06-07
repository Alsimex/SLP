package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class LeafVisitor extends Visitor{
    
    private int numLeaves = 0;
    
    @Override
    public void visit(IdExp exp) {
        numLeaves++;
        //System.out.printf("IdExp found. Number of leaves: %d\n", numLeaves);
    }
    
    @Override
    public void visit(NumExp exp) {
        numLeaves++;
        //System.out.printf("NumExp found. Number of leaves: %d\n", numLeaves);
    }
    
    public void print() {
        System.out.println("Number of leaves: " + numLeaves);
    }
    
}
