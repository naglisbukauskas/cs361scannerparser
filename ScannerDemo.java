
/**
 * @author scharffc
 *
 */
public class ScannerDemo {

    private static String file1 = "C:\\Users\\malik\\Documents\\.school-shit\\Fall 2020\\Lang\\HW 4\\cs361scannerparser\\prog1.jay";
    private static int counter = 1;

    public static void main(String args[]) {
        TokenStream ts = new TokenStream(file1);
        System.out.println(file1);
	Token tk = new Token();
        while (!ts.isEndofFile()) {
            // TO BE COMPLETED
            tk = ts.nextToken();
            System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
        }
    }
}
