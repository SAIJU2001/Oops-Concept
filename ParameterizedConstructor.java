// oops concept


// this is the class or blue print
class Book 
{
    //properties of the class
    String name;
    int page;

    // parameterzied constructor
    public Book( String name , int page )   //don't have any return type
    {
        this.name=name;
        this.page=page;
        System.out.println("parameterzied constructor called.");
    }

    //method of the class
    public void print()
     {
         System.out.println("This is the function of class");
         System.out.println("The name of book : "+this.name);
         System.out.println("The total page of book : "+this.page);
         System.out.println();
     }
}

public class ParameterizedConstructor
{
    public static void main(String args[])
    {
        //creat the object of book class
        Book B1 = new Book( "Java", 1000 );

        Book B2 = new Book( "DSA",1500 );

        B1.print();
        B2.print();
    }
}
