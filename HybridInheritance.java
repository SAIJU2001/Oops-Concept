//hybrid means any type can be posiible

//parent class
class Animal
{
    String color;
    void eat()
    {
        System.out.println("eats    ");
    }
    void breathe()
    {
        System.out.println("breathes    ");
    }
}

//child class or derived class
class Mamals extends Animal
{
    void leg()
    {
        System.out.println("legs    ");
    }
}

//child class or derived class of a derived class
class Tigers extends Mamals
{
    boolean tail;
    void run()
    {
        System.out.println("Speed high  ");
    }
}

//child class or derived class of base class
class Birds extends Animal
{
    boolean tail;
    void fly()
    {
        System.out.println("fly ");
    }
}


//child class or derived class of a derived class
class Parrot extends Birds
{
    void speak()
    {
        System.out.println("can speak   ");
    }
}

//main class
public class HybridInheritance 
{
    public static void main(String args[])
    {
        Animal al=new Animal();
        al.color="grey";
        System.out.print(al.color); //main class property
        Tigers tg=new Tigers(); //object of derived of derive class
        tg.eat();   //the property of animal and mamaml inherit to the tiger
        tg.run();
        tg.leg();
        tg.color="yellow";
        System.out.println(tg.color);
        Parrot pt=new Parrot();
        pt.fly();
        pt.eat();
        pt.speak();
    }
}

