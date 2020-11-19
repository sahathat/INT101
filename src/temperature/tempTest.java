
package temperature;

public class tempTest {
    public static void main(String[] args) {
        TempAnalysis test = new TempAnalysis(23,34);
        System.out.println(test.getStatus());
        System.out.println(test.toString());
    }
}
