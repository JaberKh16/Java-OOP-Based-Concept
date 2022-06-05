
package javaoopfundamentals.inheritance;

import java.util.Scanner;

class Electronics
{
    
    // class variables
    private String name;
    private double price;
    
    // setters for the "name" variable
    public void setName(String name)
    {
        this.name = name;
    }
    
    // getters for the "name" variable
    public String getName()
    {
        return name;
    }

    // setters for the "price" variable
    public void setPrice(double price) {
        this.price = price;
    }
    
    // getters for the "price" variable
    public double getPrice() {
        return price;
    }
       
}

class Fans extends Electronics
{
    private String airSpeed;

    public void setAirSpeed(String airSpeed) {
        this.airSpeed = airSpeed;
    }
    
     
    public String getAirSpeed() {
        return airSpeed;
    }
    
}

class WaterFan extends Fans
{
    private int waterCapacity;
    
    public void setWaterCapacity(int waterCapacity)
    {
        this.waterCapacity = waterCapacity;
    }
    
    public int getWaterCapacity()
    {
        return waterCapacity;
    }
    
}




public class MultilevelInheritance {
    
    public static void main(String [] args)
    {
        // creating an object of the child classs "WaterFan"
        WaterFan wf = new WaterFan();
        
        // taking all the inputs for the setters
        System.out.println("Enter the name of the Fan:"); 
        Scanner name_input = new Scanner(System.in);
        String name = name_input.next();
        
        System.out.println("Enter the price of the Fan:");
        Scanner price_input = new Scanner(System.in);
        double price = price_input.nextDouble();
        
        System.out.println("Enter air speed:");
        Scanner airSpeed_input =  new Scanner(System.in);
        String airSpeed = airSpeed_input.next();
        
        System.out.println("Enter water capacity:");
        Scanner waterCapacity_input = new Scanner(System.in);
        int waterCapacity = waterCapacity_input.nextInt();
        
        
        // now  assigning the value to the setters
        wf.setName(name);
        wf.setPrice(price);
        wf.setAirSpeed(airSpeed);
        wf.setWaterCapacity(waterCapacity);
        
        // getting all the assigning values via getters
        System.out.println("Fan Name:" + wf.getName());
        System.out.println("Fan Price:" + wf.getPrice());
        System.out.println("Fan Air  Speed:" + wf.getAirSpeed());
        System.out.println("Fanc Water Capacity:" + wf.getWaterCapacity());
        
        
        
    }
    
}
