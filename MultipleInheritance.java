interface Carnivore 
{
    void eatMeat();
}

interface Herbivore 
{
    void eatPlants();
}

class Bear implements Herbivore, Carnivore 
{
    public void eatMeat() 
    {
        System.out.println("Bear eats meat.");
    }

    public void eatPlants() 
    {
        System.out.println("Bear eats plants.");
    }
}

public class MultipleInheritance 
{
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatMeat();   // Output: Bear eats meat.
        bear.eatPlants(); // Output: Bear eats plants.
    }
}
