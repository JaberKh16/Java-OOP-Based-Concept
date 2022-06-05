
package javaoopfundamentals.Interface;

import java.util.Scanner;

interface Project
{
    double revenue();
    double cost();
}

class PublicProject implements Project
{
    private double factoryCost;
    private double wageCost;
    private double estimatedRevenue;
    
    PublicProject(double factoryCost, double wageCost, double estimatedRevenue) 
    { 
        //assign the variables
        this.factoryCost = factoryCost;
        this.wageCost = wageCost;
        this.estimatedRevenue = estimatedRevenue; 
    }
    
    
    @Override
    public double revenue() {
        double revenue;
        return revenue=1.3* estimatedRevenue;
    }

    @Override
    public double cost() {
        double cost;
        return cost= factoryCost+wageCost ;
        
    }

    
}

class PrivateProject implements Project
{
    private double factoryCost; 
    private double estimatedRevenue;
    
    PrivateProject(double factoryCost, double estimatedRevenue) 
    {
        //assign the variables
        this.factoryCost = factoryCost;
        this.estimatedRevenue = estimatedRevenue;
    }

    @Override
    public double revenue() {
        double revenue;
        return revenue=estimatedRevenue*2.5; 
    }

    @Override
    public double cost() {
        double cost;
        return cost= (factoryCost) *1.2;
    }   
    
}

public class InterfaceMainExample {
    
    public static void main(String [] args)
    {
        // taking the inputs
        System.out.println("Enter the Factory:");
        Scanner f = new Scanner(System.in);
        double factoryCost = f.nextDouble();
        
        System.out.println("Enter the Wage Cost :");
        Scanner w = new Scanner(System.in);
        double wageCost = w.nextDouble();
        
        System.out.println("Enter the Estimated Revenue:");
        Scanner ec = new Scanner(System.in);
        double estimatedRevenue = ec.nextDouble();
        
        Project p1 = new PublicProject(factoryCost, wageCost, estimatedRevenue);
        
        System.out.println("Cost is :" +  p1.cost());
        System.out.println("Revenue  is :" + p1.revenue());
            
    }
}
