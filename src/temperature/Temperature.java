
package temperature;

public class Temperature {
    private final double tempair;
    private final double tempdirt;
    private TempStatus tempstatus = null;
    
    public Temperature(double tempair, double tempdirt) {
        this.tempair = tempair;
        this.tempdirt = tempdirt;
        getStatus(tempair,tempdirt);
    }
    
    public double getTempair(){
        return tempair;
    }
    public double getTempdirt(){
        return tempdirt;
    }
    
    public TempStatus getStatus(double tempair,double tempdirt){
    if((2*(tempair)+3*(tempdirt))/(5) >= 35) {
        this.tempstatus = TempStatus.VERYHOT;
    }else if((2*(tempair)+3*(tempdirt))/(5) >= 30){
        this.tempstatus = TempStatus.HOT;
    }else if((2*(tempair)+3*(tempdirt))/(5) >= 25){
        this.tempstatus = TempStatus.WARM;
    }else if((2*(tempair)+3*(tempdirt))/(5) >= 20){
        this.tempstatus = TempStatus.COLD;
    }else{
        this.tempstatus = TempStatus.VERYCOLD;
    }
        return tempstatus;
    }
    
    @Override
    public String toString() {
        return "Temperature{ tempair = " + tempair + " celcius , tempdirt = " + tempdirt + " celcius , status = " + tempstatus + " }";
    }
    
}
