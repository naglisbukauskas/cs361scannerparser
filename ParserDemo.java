public class ParserDemo {

    public static void main(String[] args) {

        // Change the path!
        TokenStream tStream = new TokenStream("E:\\TempWorkspace\\cs361scannerparser2\\prog2.jay");

        ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
        Program p = cSyntax.program();
        System.out.println(p.display());
        System.out.println("test");

    }

}