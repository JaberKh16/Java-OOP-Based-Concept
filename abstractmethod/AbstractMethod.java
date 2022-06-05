
package javaoopfundamentals.abstractmethod;

abstract class Car
{
    // instance variables
    public String carModel;
    public String modelNumber;
    public double fuelCapacity;
   

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    
    
    
    // abstract method
    public abstract void carInformation();
    
}

class Engine extends Car
{
    private String engineModelName;
    private String engineSerialNumber;
    

    public String getEngineModelName() {
        return engineModelName;
    }

    public void setEngineModelName(String engineModelName) {
        this.engineModelName = engineModelName;
    }

    public String getEngineSerialNumber() {
        return engineSerialNumber;
    }

    public void setEngineSerialNumber(String engineSerialNumber) {
        this.engineSerialNumber = engineSerialNumber;
    }
   
    // declaring the definition for the abstract method in Child Class
    // note: Child class must override the Parent class abstract method in its class defintion
    @Override
    public void carInformation()
    {
        
        System.out.println("Car Model Name:" + carModel);
        System.out.println("Car Model Number:" + modelNumber);
        System.out.println("Fuel Capactiy:" + fuelCapacity);
        System.out.println("Engine Model Name:" + engineModelName);
        System.out.println("Engine Serial Number:" + engineSerialNumber);
    }
}

public class AbstractMethod {
    
    public static void main(String [] args)
    {
        Engine e = new Engine();
        e.setCarModel("BMW-SLR300");
        e.setEngineModelName("-aluminium alloy, SOHC 3 ");
        e.setEngineSerialNumber("SOHC 3 K232JK");
        e.setModelNumber("SLR21");
        e.setFuelCapacity(45.00);
        
        e.carInformation();
    }
}
