
package javaoopfundamentals.inheritance;

import java.util.Scanner;


class Person
{
    private String name;
    private int age;
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public int getAge()
    {
        return age;
    }
    
    
}

class Student extends Person
{
    private String idNumber;
    private String deptName;
    private String batchNumber;
    
    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }
    
    public String getIdNumber()
    {
        return idNumber;
    }
    
    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }
    
    public String getDeptName()
    {
        return deptName;
    }
    
    public void setBatchNumber(String batchNumber)
    {
        this.batchNumber = batchNumber;
    }
    
    public String getBatchNumber()
    {
        return batchNumber;
    }
    
    
}


class Teacher extends Person
{
    private String idNumber;
    private String deptName;
    private double salary;
    
    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }
    
    public String getIdNumber()
    {
        return idNumber;
    }
    
    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }
    
    public String getDeptName()
    {
        return deptName;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    
}



public class HierarchalInheritance {
    
    public static void main(String [] args)
    {
        // creating an object for the Student class
        Student s1 = new Student();
        
        System.out.println("Getting input for the Student Class");
        System.out.println("---------------------------------------------------------------------------------------------------");
        
        System.out.println("Enter the name:");
        Scanner input_name = new Scanner(System.in);
        String studentName = input_name.nextLine();
        
        System.out.println("Enter the age:");
        Scanner input_age = new Scanner(System.in);
        int studentAge = input_age.nextInt();
        
        System.out.println("Enter the Id:");
        Scanner input_id = new Scanner(System.in);
        String studentIdNumber = input_id.next();
        
        System.out.println("Enter the Department Name:");
        Scanner input_deptName = new Scanner(System.in);
        String studentDeptName = input_deptName.next();
        
        System.out.println("Enter the Batch Number:");
        Scanner input_batchNumber = new Scanner(System.in);
        String studentBacthNumber = input_batchNumber.next();
        
        // assigning all the inputs for the Student class
        s1.setName(studentName);
        s1.setAge(studentAge);
        s1.setIdNumber(studentIdNumber);
        s1.setDeptName(studentDeptName);
        s1.setBatchNumber(studentBacthNumber);
        
        // getting all the output values for the Student class
        System.out.println( "Name:"+ s1.getName());
        System.out.println("Age:" + s1.getAge());
        System.out.println("Id:" + s1.getIdNumber());
        System.out.println( "Department Name:"+ s1.getDeptName());
        System.out.println( "Batch:" + s1.getBatchNumber());
        
        
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------------");
        
        // creating an object for the Teacher class
        Teacher t1 = new Teacher();
        
        System.out.println("Getting input for the Teacher Class");
        System.out.println("---------------------------------------------------------------------------------------------------");
        
        System.out.println("Enter the name:");
        Scanner input_tname = new Scanner(System.in);
        String teacherName = input_tname.nextLine();
        
        System.out.println("Enter the age:");
        Scanner input_tage = new Scanner(System.in);
        int teacherAge = input_tage.nextInt();
        
        
        System.out.println("Enter the Employee Id:");
        Scanner input_tid = new Scanner(System.in);
        String teacherIdNumber = input_tid.next();
        
        System.out.println("Enter the Department Name:");
        Scanner input_tdeptName = new Scanner(System.in);
        String teacherDeptName = input_tdeptName.next();
        
        System.out.println("Enter the Salary:");
        Scanner input_salary = new Scanner(System.in);
        double teacherSalary = input_salary.nextDouble();
        
        // assigning all input for the Teacher class
        t1.setName(teacherName);
        t1.setAge(teacherAge);
        t1.setIdNumber(teacherIdNumber);
        t1.setDeptName(teacherDeptName);
        t1.setSalary(teacherSalary);
        
        
        // getting all the outputs for the Teacher class
        System.out.println( "Name:"+ t1.getName());
        System.out.println("Age:" + t1.getAge());
        System.out.println("Id:" + t1.getIdNumber());
        System.out.println( "Department Name:"+ t1.getDeptName());
        System.out.println( "Salary:" + t1.getSalary());
        
        
        
    }
    
}
