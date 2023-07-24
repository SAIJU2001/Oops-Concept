//static keyword is used to share the same variable or method of a class


class Student
{
    String name;
    int roll;
    static String schoolName;   //static school name 
    
    void setName( String name)
    {
        this.name=name;
    }
    String getName()
    {
        return this.name;
    }
}


public class StaticKeyword 
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.schoolName="JHS";    //school name apply for the 1st object but it goes for all 
        System.out.println(s1.schoolName);
        Student s2=new Student();
        System.out.println(s2.schoolName);
        Student s3=new Student();
        s3.setName("sandy");   
        System.out.print(s3.getName());
    }
}
