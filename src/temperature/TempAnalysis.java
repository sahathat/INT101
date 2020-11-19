
package temperature;

public class TempAnalysis {
    private int plantid=1;
    private double tempair;
    private double tempdirt;
    private int count=0;
    private TempStatus tempstatus;

    public TempAnalysis(double tempair, double tempdirt) {
        this.tempair = tempair;
        this.tempdirt = tempdirt;
    }
    
    public TempStatus getStatus(){
        if(tempair >= 35 && tempdirt >= 35){
            this.tempstatus = TempStatus.VERYHOT;
        }else if(tempair >= 30 && tempdirt >= 30){
            this.tempstatus = TempStatus.HOT;
        }else if(tempair >= 25 && tempdirt >= 25){
            this.tempstatus = TempStatus.WARM;
        }else if(tempair >= 20 && tempdirt >= 20){
            this.tempstatus = TempStatus.COLD;
        }else{
            this.tempstatus = TempStatus.VERYCOLD;
        }
        return tempstatus;
    }

    @Override
    public String toString() {
        return "TempAnalysis{" + "plantid=" + plantid + ", tempair=" + tempair + ", tempdirt=" + tempdirt + ", tempstatus=" + tempstatus + '}';
    }
    
}
