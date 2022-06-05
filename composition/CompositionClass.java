
package javaoopfundamentals.composition;


class Car 
{
    // class state  or attributes
    private String carColor;
    private int carGears;
    
    // creating Engine class object
    EngineClass e = new EngineClass();
    
    // creating this class constructor
    Car(String carColor, int carGears, int carPower, String transmission)
    {
        // setting the EngineClass setters from here
        e.setCarPower(carPower);
        e.setTransmission(transmission);
        // setting own class attributes value
        this.carColor = carColor;
        this.carGears = carGears;
    }
    
    
    // getting the getters for the Car Class
    public String getCarColor()
    {
        return carColor;
    }
    
    public int getCarGears()
    {
        return carGears;
    }
    
    public int getCarPower()
    {
        return e.getCarPower();
    }
    
    public String getTransmission()
    {
        return e.getTransmission();
    }
    
}

public class CompositionClass {
    
    public static void main(String [] args)
    {
        // creating the object for the "Car" class here
        Car car = new Car("Black", 5, 5000, "Manual");
        System.out.println(car.getCarColor());
        System.out.println(car.getCarGears());
        System.out.println(car.getCarPower());
        System.out.println(car.getTransmission());
    }
    
}
