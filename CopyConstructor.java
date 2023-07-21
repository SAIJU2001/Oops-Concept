// oops concept

import java.util.*;

// this is the class or blue print
class Pen 
{
    //properties of the class
    String color;
    String type;
    String company;

    //function of the class
    public void print()
    {
        System.out.println("This is the function of class");
        System.out.println("The color of the pen : "+this.color);
        System.out.println("The type of the pen : "+this.type);
        System.out.println("The company of the pen : "+this.company);
        System.out.println();
    }

    // parameterized constructor
    Pen( String color, String type, String company )   //don't have any return type
    {
        this.color=color;
        this.type=type;
        this.company=company;
    }
    //copy constructor
    Pen(Pen p1)
    {
        this.color=p1.color;
        this.type=p1.type;
        this.company=p1.company;
    }
}

public class CopyConstructor
{
    public static void main(String args[])
    {
        //creat the object of pen class
        Pen pen1 = new Pen( "blue", "ball pen", "Fort" );

        Pen pen2 = new Pen( pen1);  //copy constructor called
        pen2.print();
    }
}
