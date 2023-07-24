//by default java uses the super keyword
//it first call the parent constructore the child constructor

//parent class
class Animal
{
    Animal()    //constructor
    {
        System.out.print("animal constructor is called");
    }
}

//child class
class Horse extends Animal
{
    Horse()    //constructor
    {
        super();    //keyword called
        System.out.print("horse constructor is called");
    }
}

public class SuperKeyword 
{
    public static void main(String args[])
    {
        Horse hr=new Horse();   
    }    
}
