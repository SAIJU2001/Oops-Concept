//when any class property or method inherit by another class is called Inheritance
//extends is the keyword for inherit

//parent class or base class
class Animal
{
    String color;
    void eat()
    {
        System.out.print("eats");
    }
    void breathe()
    {
        System.out.print("breathes");
    }
}

//child class or derived class
class Tigers extends Animal
{
    boolean tail;
    void run()
    {
        System.out.print("Speed high");
    }
}

public class Inheritance
{
    public static void main(String args[])
    {
        Tigers tg=new Tigers();
        tg.eat();   //the property of animal inherit to the tiger
    }
}