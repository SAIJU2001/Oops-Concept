// multi level inheritence
// base class ==> derived class ==> derived class


//base class or parent class
class Shape 
{
    void perimeter()
    {
        System.out.println("Display perimeter of shape.  ");
    } 
}

// this is the child class or derived class
class Triangle extends Shape
{
    int sideLength;
    public void area()
    {
        System.out.println( "Display the area of the triange " );
    }
}

//derived class of a derived class
class EquilateralTriangle extends Triangle
{
    public void type()
    {
        System.out.println("It is a type of triange ");
    }
}

public class MultiLevelInheritance
{
    public static void main(String args[])
    {
        //creat the object of triangle class
        EquilateralTriangle eqt = new EquilateralTriangle();
        eqt.area(); //derived class object call
        eqt.type();     //derived of derived class cobject call
        eqt.perimeter();    //perant class object call
        Triangle t = new Triangle();
        t.sideLength=5;
        System.out.print(t.sideLength);
    }
}
