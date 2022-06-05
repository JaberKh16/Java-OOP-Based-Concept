
package javaoopfundamentals.abstractclass;


abstract class Shape
{
    public double dim1;
    
    public Shape(double dim1)
    {
        this.dim1 = dim1;
    }
    
    public abstract void printArea();
    
}

class Circle extends Shape
{
    
    public Circle(double dim1) {
        super(dim1);
    }
    
    @Override
    public void printArea()
    {
        System.out.println("Dimension of Circle value is : " + 3.1416 *(dim1 * dim1));
    }
    
}


class Rectangle extends Shape
{
    public double dim2;
    public Rectangle(double dim1, double dim2)
    {
        super(dim1);
        this.dim2 = dim2;
    }
    
    @Override
    public void printArea()
    {
        System.out.println("Dimension of Rectnagle value is : " + (dim1 + dim2));
    }
}
public class AbstractClassPractice {
    
    public static void main(String[] args)
    {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(20, 10);
        
        // calling the abstract method using the child class or subclass
        circle.printArea();
        rectangle.printArea();
        
    }
}
