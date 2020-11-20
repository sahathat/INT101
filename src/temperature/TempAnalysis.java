
package temperature;

public final class TempAnalysis {
    private final Temperature[] temp;
    private int count=-1;

    public TempAnalysis(int count) {
        temp = new Temperature[count];
    }
    
    public void add(double tempair, double tempdirt){
        if(count<=temp.length){
            count++;
            temp[count] = new Temperature(tempair, tempdirt);
        }
    }
    
    @Override
    public String toString() {
        String s = "" ;
        for(int i=0;i<=count;i++){
            s = s + "\n" + "plantid : " + (i+1) + " , " + temp[i];
        }
        return "TempAnalysis(" + s +" \n)";
    }    
}
