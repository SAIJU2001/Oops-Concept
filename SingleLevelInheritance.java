//base class ==> derived class 

//parent class or base class
class Animal
{
    String color;
    void eat()
    {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathes");
    }
}

//child class or derived class
class Tigers extends Animal
{
    boolean tail;
    void run()
    {
        System.out.println("Speed high");
    }
}

//main class
public class SingleLevelInheritance 
{
    public static void main(String args[])
    {
        Tigers tg=new Tigers();
        tg.eat();   //the property of animal inherit to the tiger
        tg.run();
        tg.color="yellow";
        System.out.println(tg.color);
    }
}
