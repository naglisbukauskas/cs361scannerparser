public class ParserDemo {

    public static void main(String[] args) {
        String malikTestLoc = "C:\\Users\\malik\\Documents\\.school-shit\\Fall 2020\\Lang\\HW 4\\cs361scannerparser\\prog1.jay";
        String naglisTestLoc = "E:\\TempWorkspace\\cs361scanner\\prog2.jay";

        // Change the path!
        TokenStream tStream = new TokenStream(malikTestLoc);

        ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
        Program p = cSyntax.program();
        System.out.println(p.display());
        System.out.println("test");

    }

}