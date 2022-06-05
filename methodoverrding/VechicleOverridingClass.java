
package javaoopfundamentals.methodoverrding;


class Vehicle
{
    public String grade;
    public double roadTax;
    
    Vehicle(String grade, double roadTax)
    {
        this.grade = grade;
        this.roadTax = roadTax;
    }
    
    public double totalTax()
    {
        return roadTax;
    }
    
}

class Public_Vehicle extends Vehicle
{
    
    public double fitnessTax;
    
    public Public_Vehicle(String grade, double roadTax, double fitnessTax) 
    {
        super(grade, roadTax);
        this.fitnessTax = fitnessTax;
    }
    
    @Override
    public double totalTax()
    {
        return fitnessTax+roadTax;
    }
    
    
}

class Private_Vehicle extends Vehicle
{
    
    public double fitnessTax;
    
    public Private_Vehicle(String grade, double roadTax, double fitnessTax) 
    {
        super(grade, roadTax);
        this.fitnessTax = fitnessTax;
    }
    
    @Override
    public double totalTax()
    {
        return 1.5*(fitnessTax+roadTax);
    }
    
    
}

public class VechicleOverridingClass {
    
    public static void main(String [] args)
    {
        
        Vehicle [] v1 = new Vehicle[5];
       
        v1[0] = new Public_Vehicle("public", 450.55, 550.50);
        v1[1] = new Public_Vehicle("public", 650.55, 850.50);
        v1[2] = new Public_Vehicle("public", 850.55, 950.57);
        v1[3] = new Private_Vehicle("private", 450.55, 950.530);
        v1[4] = new Private_Vehicle("private", 750.55, 380.520);
        
        System.out.println("All grades vehicle tax information here!!!");
        
        for (int i = 0; i<v1.length; i++)
        {
           System.out.println( "Total Tax is : " + v1[i].totalTax());
        }
        
   
    }
    
}
