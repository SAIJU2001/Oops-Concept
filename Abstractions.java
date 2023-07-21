//hiding all the unnecessary details and showing only the important parts

abstract class Animal
{
    //idea
    abstract void walk();
    //its not useful to the user so hide it using abstract
}

class Horse extends Animal
{
    public void walk()
    {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal
{
    public void walk()
    {
        System.out.println("walks on 2 legs");
    }
}

//driver
public class Abstractions 
{
    public static void main(String args[])
    {
        Chicken ch=new Chicken();
        ch.walk();
        Horse hr=new Horse();
        hr.walk();
    }    
}
