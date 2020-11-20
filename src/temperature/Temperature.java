/**
 * <h1>Temperature</h1>
 *
 * -set double variable air and dirt temperature of plant
 *
 * -set status air and dirt temperature of plant
 * -condition with 2 time of air temperature and 3 time of dirt temperature divid by mutiple of 5
 *
 * -show status
 */

package temperature;

public class Temperature {

    //initial value
    private final double tempair;
    private final double tempdirt;
    private TempStatus tempstatus = null;

    //constructor
    public Temperature(double tempair, double tempdirt) {
        this.tempair = tempair;
        this.tempdirt = tempdirt;
        //get status of temperature
        getStatus(tempair,tempdirt);
    }

    //getter value tempair and tempdirt
    public double getTempair(){
        return tempair;
    }
    public double getTempdirt(){
        return tempdirt;
    }

    //condition status of tempair and tempdirt
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

    //toString value
    @Override
    public String toString() {
        return "Temperature{ tempair = " + tempair + " celcius , tempdirt = " + tempdirt + " celcius , status = " + tempstatus + " }";
    }

}