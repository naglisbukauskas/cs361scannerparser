/**
 * @author scharffc
 *
 */
public class ScannerDemo {

    String Malik = "C:\\Users\\malik\\Documents\\.school-shit\\Fall 2020\\Lang\\HW 4\\cs361scannerparser\\prog1.jay";
    static String Naglis = "E:\\TempWorkspace\\cs361scanner\\prog2.jay";
    String ProfScharff = "C:\\Users\\cscharff\\eclipse-workspace\\ScannerSolution\\src\\prog1.jay";

    private static String file1 = "C:\\Users\\malik\\Documents\\.school-shit\\Fall 2020\\Lang\\HW 4\\cs361scannerparser\\prog1.jay";
    private static int counter = 1;

    public static void main(String[] args) {
        TokenStream ts = new TokenStream(Naglis);
        System.out.println(Naglis);
        Token tk;
        while (!ts.isEndofFile()) {
            // TO BE COMPLETED
            tk = ts.nextToken();
            System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
        }
    }
}