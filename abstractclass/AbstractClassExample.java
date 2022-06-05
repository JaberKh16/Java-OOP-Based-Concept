
package javaoopfundamentals.abstractclass;

import java.util.Scanner;


abstract class Vehicle
{
    // class variables
    public String grade;
    public double roadTax;
    
    Vehicle(String grade, double roadTax)
    {
        this.grade = grade;
        this.roadTax = roadTax;
    }
    
    // abstract method
    abstract double totalTax();
    
    // default method
    public void print()
    {
        System.out.println("Grade is :" + grade);
        System.out.println("Total Tax is :" + totalTax());
    }
    
}


class PublicVehicle extends Vehicle
{
    private double fitnessTax;
    
    PublicVehicle(String grade, double roadTax, double fitnessTax)
    {
        super(grade, roadTax);
        this.fitnessTax = fitnessTax;
    }
    
    @Override
    double totalTax() {
        double totaltax;
        return totaltax= 1.5*(fitnessTax+roadTax);    
    }
    
    @Override
    public void print()
    {
        System.out.println("Grade is :" + grade);
        System.out.println("Total Tax is :" + totalTax());
    }
    
}


class PrivateVehicle extends Vehicle
{
    private double fitnessTax;
    
    PrivateVehicle(String grade, double roadTax, double fitnessTax)
    {
        super(grade, roadTax);
        this.fitnessTax = fitnessTax;
    }

    @Override
    double totalTax() {
        double totaltax;
        return totaltax= 2*( fitnessTax+roadTax);
        
    }
    
    @Override
    public void print()
    {
        System.out.println("Grade is :" + grade);
        System.out.println("Total Tax is :" + totalTax());
    }
    
}



public class AbstractClassExample {
    
     public static void main(String [] args)
    {
        Vehicle vehicle1 [] = new PublicVehicle[2];
        Vehicle vehicle2 [] = new PrivateVehicle[2];
        
        // taking pubic vehicle inputs
        for(int i = 0; i < vehicle1.length; i++)
        {
            
            System.out.println(" Taking Public Vehicle-"+(i+1) + "Information:");
            System.out.println("==================================================");
           // taking all the necessary input//
            System.out.println("Enter the Grade:");
            Scanner input_grade = new Scanner(System.in);
            String grade = input_grade.nextLine();
        
            System.out.println("Enter the Road Tax:");
            Scanner input_rtax = new Scanner(System.in);
            double roadTax = input_rtax.nextDouble();
        
            System.out.println("Enter the Fitness tax:");
            Scanner input_fittax = new Scanner(System.in);
            double fitnessTax = input_fittax.nextDouble();
            // finished of taking all necessary inputs//
            System.out.println("==================================================");
            
            vehicle1[i] = new PublicVehicle(grade, roadTax, fitnessTax);
                 
        }
        
       // printing public vehicle information   
       for(int i=0; i < vehicle1.length; i++)
       {
           vehicle1[i].print();
       }
        
        
        // taking private vehicle inputs
        for(int i = 0; i < vehicle2.length; i++)
        {
            
            System.out.println(" Taking Private Vehicle-"+(i+1) + "Information:");
            System.out.println("==================================================");
           // taking all the necessary input//
            System.out.println("Enter the Grade:");
            Scanner input_grade = new Scanner(System.in);
            String grade = input_grade.nextLine();
        
            System.out.println("Enter the Road Tax:");
            Scanner input_rtax = new Scanner(System.in);
            double roadTax = input_rtax.nextDouble();
        
            System.out.println("Enter the Fitness tax:");
            Scanner input_fittax = new Scanner(System.in);
            double fitnessTax = input_fittax.nextDouble();
            // finished of taking all necessary inputs//
            System.out.println("==================================================");
            
            vehicle2[i] = new PrivateVehicle(grade, roadTax, fitnessTax);
                 
        }
        
        // printing public vehicle information
       for(int i=0; i < vehicle1.length; i++)
       {
           vehicle2[i].print();
       }
       
       
    }
    
}

