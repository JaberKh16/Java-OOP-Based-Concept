
package javaoopfundamentals.methodoverloading;


class Shape
{
    public double dim1;
    public double dim2;
    public double dim3;
    
    
//    Shape(double dim1, double dim2, double dim3)
//    {
//        this.dim1 = dim1;
//        this.dim2 = dim2;
//        this.dim3 = dim3;
//    }
//
//    Shape() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void areaOfShape()
    {
        double area = 0.0;
        System.out.println("A Point has no area:" + " " + area);
    }
    
    public void areaOfShape(double dim1)
    {
        double area = dim1;
        System.out.println("A Line has Area:" + " " + area);
    }
    
     public void areaOfShape(double dim1, double dim2)
    {
        double area = dim1 * dim2;
        System.out.println("A Rectangle has Area:" + " " + area);
    }
     
     public void areaOfShape(double dim1, double dim2, double dim3)
    {
        double volume = dim1 * dim2 * dim3;
        System.out.println("A Sphere has Area:" + " " + volume);
    }
    
}

public class MethodOverloading {
    
    public static void main(String [] args)
    {
        Shape shape = new Shape();
        // calling the parameterless Shape constructor
        shape.areaOfShape();
        // calling the 1 parameter based method areaOfShape(dim1)
        shape.areaOfShape(5.63);
        // calling the 2 parameter based method areaOfShape(dim1, dim2)
        shape.areaOfShape(43.42, 53.32);
        // calling the 3 parameter based method areaOfShape(dim1, dim2, dim3)
        shape.areaOfShape(45.23, 24.31, 72.23);
        
    }
}
