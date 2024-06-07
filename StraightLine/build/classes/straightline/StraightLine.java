package straightline;

/**
 *  Author: Dayton McManus
 *  
 */

public class StraightLine {

    public static void main(String[] args) {
        
        Stm prog = 
            new CompoundStm(new CompoundStm(new AssignStm(new IdExp("a"),
            new NumExp(3)), new AssignStm(new IdExp("b"),
            new OpExp(new IdExp("a"), OpExp.Times, new NumExp(4)))),
            new CompoundStm(new AssignStm(new IdExp("c"),
            new EseqExp(new PrintStm(new LastExpList(new IdExp("b"))), 
            new OpExp(new IdExp("b"), OpExp.Plus, new IdExp("a")))),
            new AssignStm(new IdExp("d"),
            new EseqExp(new AssignStm(new IdExp("e"), new NumExp(5)),
            new EseqExp(new PrintStm(new PairExpList(new EseqExp(
            new PrintStm(new LastExpList(new IdExp("e"))), new NumExp(6)),
            new LastExpList(new EseqExp(new AssignStm(new IdExp("f"),
            new OpExp(new IdExp("e"), OpExp.Div, new NumExp(7))),
            new OpExp(new IdExp("e"), OpExp.Minus, new IdExp("f")))))),
            new NumExp(8))))));
        
        LeafVisitor leafVisitor = new LeafVisitor();
        SymbolVisitor symbolVisitor = new SymbolVisitor();
        PrettyPrintVisitor prettyVisitor = new PrettyPrintVisitor();
        
        System.out.println("Leaf Visitor output:");
        prog.accept(leafVisitor);
        leafVisitor.print();
        
        System.out.println("\nSymbol Table Visitor output:");
        prog.accept(symbolVisitor);
        symbolVisitor.print();
        
        System.out.println("\nPretty Print Visitor output:");
        prog.accept(prettyVisitor);
        
    }
}




