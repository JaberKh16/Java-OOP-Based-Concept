
package javaoopfundamentals.inheritance.example;


public class Doctor {
    
    public String name;
    public int rank;
    public double basic_salary;
    
    Doctor(String name, int rank, double basic_salary)
    {
        this.name = name;
        this.rank = rank;
        this.basic_salary = basic_salary;
    }

    
    public double getSalary()
    {
        return basic_salary;
    }
	
    public int printInformation()
    {
        System.out.println("Name : " + name);
        System.out.println("Salary :" + getSalary());
        return 1;
    }


}

class GradeA extends Doctor
{
    private double incentive;
    private double yearly_bonus;
   
    
    public GradeA(String name, int rank, double basic_salary, double incentive, double yearly_bonus) {
        super(name, rank, basic_salary);
        this.incentive = incentive;
        this.yearly_bonus = yearly_bonus;
    }
    
    public double getIncentive() {
        return incentive;
    }

    public double getYearly_bonus() {
        return yearly_bonus;
    }
    
 

    @Override
    public double getSalary()
    {
        return (1+incentive)*(basic_salary+yearly_bonus);
    }
    
    @Override
    public int printInformation()
    {
        System.out.println("Name : " + name);
        System.out.println("Salary :" + getSalary());
        return 1 ;
    }
    
}

class GradeB extends Doctor
{
    private double monthly_bonus;
    
    public GradeB(String name, int rank, double basic_salary, double monthly_bonus) {
        super(name, rank, basic_salary);
        this.monthly_bonus = monthly_bonus;
    }

    public double getMonthly_bonus() {
        return monthly_bonus;
    }
    
    @Override
    public double getSalary()
    {
        return basic_salary + 12 * monthly_bonus;
    }
    
    
    @Override
    public int printInformation()
    {
        System.out.println("Name : " + name);
        System.out.println("Salary :" + getSalary());
        return 1 ;
    }
    
}
