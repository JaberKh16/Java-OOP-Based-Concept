
package javaoopfundamentals.inheritance.example;
import javaoopfundamentals.inheritance.example.Doctor.*;

public class Main {
    
    public static void main(String [] args)
    {
        Doctor [] doctors = new Doctor[5];
        doctors[0] = new GradeA("Mr.A",  1, 1000.0, 200.0, 500.);
        doctors[1] = new GradeA("Mr.B",  2, 2000.0, 500.0, 300.0);
        doctors[2] = new GradeA("Mr.C",  1, 1000.0, 100.0, 700.0);
        
        for(int i =0; i<doctors.length; i++)
        {
            System.out.println("==========================================");
            System.out.println("Doctor Information-" + " " + (i+1));
            System.out.println("Name is :" + doctors[i].name);
            System.out.println("Rank is :" + doctors[i].rank);
            System.out.println("Basic Salary is :" + doctors[i].basic_salary);
            System.out.println("==========================================");
            System.out.println("Name is :" + doctors[i].printInformation());
            System.out.println("==========================================");
        }
        
    }
    
}