//same functions are uses for different works
//its two type run time and compile time polymorphism

class Student
{
    String name;
    int roll;

    //same name method but different parameter
    public void print( String name)
    {
        System.out.println(name);
    }
    public void print( int roll)
    {
        System.out.println(roll);
    }
    public void print( String name,int roll)
    {
        System.out.println(name+" "+roll);
    }
}

//driver
public class Polymorphism 
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.print("saikat");
        s1.print(1003);
        s1.print("sandy",1004);
    }    
}
