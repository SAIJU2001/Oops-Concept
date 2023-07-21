// oops concept
// hierarchial level inheritence
//multiple derived class of one parent class

// this is the base class or parent class
class Shape 
{
    public void area()
    {
        System.out.println("Display area of shape");
    }
}

// this is the child class or derived class
class Triangle extends Shape
{
    public void perimeter()
    {
        System.out.println("Display perimeter of Triangle ");
    }
}

//another derived class 
class Circle extends Shape
{
    public void radius()
    {
        System.out.println("Display radius of Circle ");
    }
}

public class HierarchialInheritence
{
    public static void main(String args[])
    {
        //creat the object of pen class
        Triangle T1 = new Triangle();
        T1.area();
        T1.perimeter();
        Circle c1 = new Circle();
        c1.area();
        c1.radius();
    }
}
