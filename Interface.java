//interface is blue print of class

//interface
interface chessPlayer
{
    void moves();   //here it is the idea
}

class Queen implements chessPlayer
{
    //implement of idea
    public void moves()
    {
        System.out.println("up,down,left,right,diagonal");
    }
}

class King implements chessPlayer
{
    //implement of idea
    public void moves()
    {
        System.out.println("up,down,left,right(by 1 step)");
    }
}

public class Interface 
{
    public static void main(String args[])
    {
        Queen q=new Queen();
        q.moves();
        King k=new King();
        k.moves();
    }
}
