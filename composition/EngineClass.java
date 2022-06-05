
package javaoopfundamentals.composition;

public class EngineClass {
    
    
    private int carPower;
    private String transmission;
    
    // this the class read-only methods or getters
    public int getCarPower() {
        return carPower;
    }

    public String getTransmission() {
        return transmission;
    }
    
    
    // this is the class write-only methods or setters
    public void setCarPower(int carPower) {
        this.carPower = carPower;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    
    
    
}
