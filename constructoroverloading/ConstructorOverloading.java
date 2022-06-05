
package javaoopfundamentals.constructoroverloading;

class Box
{
    public double height;
    public double width;
    public double depth;
    
    // Constructor with no parameter
    Box()
    {
        height = 2.0;
        width = 3.5;
        depth = 1.5;
    }
    
    Box(double length)
    {
        height=width=depth=length;
    }
    
    // Constructor with 3 parameters
    Box(double height, double width, double depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    public double getVolume()
    {
        return height * width * depth;
    }
    
}
public class ConstructorOverloading {
    
    public static void main(String [] args)
    {
        Box b1 = new Box();
        System.out.println(b1.getVolume());
        Box b2 = new Box(12);
        System.out.println(b2.getVolume());
        Box b3 = new Box(10, 20, 5);
        System.out.println(b3.getVolume());
    }
    
}
