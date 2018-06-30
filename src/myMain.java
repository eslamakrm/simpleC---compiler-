import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class myMain {
    public static void main(String[] args) {
        try {
            String source = "F:\\simple\\src\\text.txt";
            CharStream cs = fromFileName(source);
            GramLexer lexer = new GramLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            GramParser parser = new GramParser(token);
            ParseTree tree = parser.program();

            myVisitor visitor = new myVisitor();
            visitor.visit(tree);


            myVisitor.printMap(myVisitor.symbolTable);
        } catch (IOException e) {
            e.printStackTrace();
        }


        int  i=125;int j=100; while (i-j >0) if (i<j) j=j-i; else i=i-j;
        i=1; while (i<100) i=i+i;
        i=1; do i=i+10; while (i<50);
        int x=0;
        int y=0;


        i=7; if (i<5)x=1; if (i<10) y=2;
        System.out.println(x);
        System.out.println(i);
        System.out.println(y);
        System.out.println(j);


    }
}