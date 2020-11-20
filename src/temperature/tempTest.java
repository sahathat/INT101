
package temperature;

public class tempTest {
    public static void main(String[] args) {
        double[] tempair = {40.0,28.0,22.0};
        double[] tempdirt = {36.0,28.0,20.0}; 
        TempAnalysis test0 = new TempAnalysis(6);
        test0.add(tempair[0], tempdirt[0]);
        test0.add(tempair[1], tempdirt[1]);
        test0.add(tempair[2], tempdirt[2]);
        System.out.println(test0.toString());
    }
}
