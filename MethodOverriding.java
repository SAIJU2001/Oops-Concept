//parent and child classes both contain the same function with a different defination
//run time polymorphism


//parent class or base class
class Animal
{
    void eat()
    {
        System.out.println("eats everything");
    }
}

//child class
class Deer extends Animal
{
    void eat()
    {
        System.out.println("eats grass");
    }
}

//driver 
public class MethodOverriding 
{
    public static void main(String args[])
    {
        Deer d=new Deer();
        d.eat();
    }
    
}
