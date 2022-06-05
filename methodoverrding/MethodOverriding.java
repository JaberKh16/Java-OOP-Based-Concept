
package javaoopfundamentals.methodoverrding;

class Animal
{
    public String name;
    public String size;
    
    Animal(String name, String size)
    {
        this.name = name;
        this.size = size;
    }
    
    public void display()
    {
        System.out.println("Inside the Animal Class Display Method");
        System.out.println("Animal Name is :" + name);
        System.out.println("Animal Size is :" + size);
    }
}


class Bird extends Animal
{
    public boolean canFly;

    public Bird(String name, String size, boolean canFly) {
        // though parent has parameterized constructor this super() must matched the parent class constructor
        super(name, size);
        this.canFly=canFly;
    }
    
    // child class overriding parent class display() method
    @Override
    public void display()
    {
        System.out.println("Inside the Bird Class Display Method");
        System.out.println("Bird Name is :" + name);
        System.out.println("Bird Size is :" + size);
        System.out.println("Bird Size is  :" + size + " " + "and Bird can Fly:" + " " + canFly);
    }
    
    public void showBoth()
    {
        // here, display() will be interpret as this.display() so this class display() method will be called
        display();
    }
    
}
public class MethodOverriding {
    
    public static void main(String [] args)
    {
        // creating an object for the Animal class
        Animal animal = new Animal("Bird", "40gm");
        // calling the Animal class display() method
        animal.display();
        
        // creating an object for the Bird class
        Bird bird = new Bird("Parrot" , "50gm", true);
        // calling the Bird class display() method
        bird.display();
        
        // calling the showBoth() method
        bird.showBoth();
    }
    
}
