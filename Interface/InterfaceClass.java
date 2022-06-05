
package javaoopfundamentals.Interface;

interface Animal
{
    
      public static final String animal ="Animal"; 
     // 2 public abstract method
     public abstract void eat();
     public abstract void color();
     // 1 default abstract method
     abstract void weight();

}

class Lion implements Animal
{
    private static String name;

    static
    {
        name = "Lion";
    }
    
    @Override
    public void eat()
    {
        System.out.println("Lion eats meat");
    }
    
    @Override
    public void color()
    {
        System.out.println("Lion is brown in color");
    }
    
    @Override
    public void weight()
    {
        System.out.println("Lion is 300kg");
    }
    
}


class Cat implements Animal
{
    private static String name;

    static
    {
        name = "Cat";
    }
    
    @Override
    public void eat()
    {
        System.out.println("Cat eats fish");
    }
    
    @Override
    public void color()
    {
        System.out.println("Cat is blackish in color");
    }
    
    @Override
    public void weight()
    {
        System.out.println("Cat is 5kg");
    }
}

public class InterfaceClass {
    
    public static void main(String [] args)
    {
        Lion lion = new Lion();
        
        
        lion.eat();
        lion.color();
        lion.weight();
        
        Cat cat = new Cat();
        cat.eat();
        cat.color();
        cat.weight();
    }
    
}
