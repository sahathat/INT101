/**
 * <h1>TempAnalysis</h1>
 *
 * -set data array constructor is <pre>temp</pre> keep toString in <pre>Temperature</pre>
 * -set data array is air and dirt keep double <pre>tempair</pre> and <pre>tempdirt</pre> value in <pre>Temperature</pre>
 * -set <pre>count</pre> to increase data in array
 *
 * -condition average with sum 2 time of air temperature and 3 time of dirt temperature divid by mutiple of 5 and count+1
 * -set <pre>Tempstatus</pre> in average temperature mode
 *
 * -show all status and average status
 */

package temperature;

public final class TempAnalysis {
    //initial value
    private final Temperature[] temp;
    private TempStatus statusavg;
    private final double[] air;
    private final double[] dirt;
    private int count=-1;

    //constructor array
    public TempAnalysis(int count) {
        //keep toString in Temperature
        temp = new Temperature[count];
        //keep tempair
        air = new double[count];
        //keep tempdirt
        dirt = new double[count];
    }

    //condition to add data of temperature
    public void add(double tempair, double tempdirt){
        if(count<=temp.length){
            count++;
            temp[count] = new Temperature(tempair, tempdirt);
            air[count] = tempair;
            dirt[count] = tempdirt;
            //get status of average temperature
            getStatus(tempair,tempdirt);
        }
    }

    //sum of air temperature array
    public double sumair(){
        double sum = 0;
        for(int i=0;i<air.length;i++){
            sum += air[i];
        }
        return sum;
    }

    //sum of dirt temperature array
    public double sumdirt(){
        double sum = 0;
        for(int i=0;i<dirt.length;i++){
            sum += dirt[i];
        }
        return sum;
    }

    //average of temperature
    public double avg(){
        return (3*sumdirt()+2*sumair())/(5*(count+1));

    }

    //show status of average temperature
    public TempStatus getStatus(double tempair,double tempdirt){
        if(avg() >= 35) {
            statusavg = TempStatus.VERYHOT;
        }else if(avg() >= 30){
            statusavg = TempStatus.HOT;
        }else if(avg() >= 25){
            statusavg = TempStatus.WARM;
        }else if(avg() >= 20){
            statusavg = TempStatus.COLD;
        }else{
            statusavg = TempStatus.VERYCOLD;
        }
        return statusavg;
    }

    //toString
    @Override
    public String toString() {
        String s = "" ;
        for(int i=0;i<=count;i++) {
            s = s + "\n" + "Plantid : " + (i + 1) + " , " + temp[i];
        }
        return "TempAnalysis(" + s + "\nAverage Temperature = " + avg() + " Status = " + statusavg + " \n)";
    }    
}
