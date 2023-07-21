

class Account 
{ 
    public String name;
    protected String email;
    private String password;

    // for private keyword, we only access in the class
    // get the password (getters)
    public String getPassword() 
    {
        return this.password;
    }

    // set the password (setters)
    public void setPassword(String pass) 
    {
        this.password = pass;
    }
}

public class AccessModifier 
{
    public static void main(String args[]) 
    {
        Account A1 = new Account();
        A1.name = "saikat";
        A1.email = "yourmail@gmail.com"; // This works because email has "protected" access.
        A1.setPassword("password"); // This works because setPassword is a public method.

        String pass = A1.getPassword(); // This works because getPassword is a public method.
        System.out.print(pass); // Output: saikat
    }
}
