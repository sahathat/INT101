
package temperature;

public class Temperature {
    private int plantid=1;
    private final double tempair;
    private final double tempdirt;
    
    public Temperature(double tempair, double tempdirt) {
        this.tempair = tempair;
        this.tempdirt = tempdirt;
    }
    
    public double getTempair(){
        return tempair;
    }
    public double getTempdirt(){
        return tempdirt;
    }
    
    public double[] getTemp() {
        return new double[]{this.tempair, this.tempdirt};
    }
    
    @Override
    public String toString() {
        return "Temperature{ " + "plantid = " + plantid + " , tempair = " + tempair + " celcius , tempdirt = " + tempdirt + " celcius }";
    }
    
}
