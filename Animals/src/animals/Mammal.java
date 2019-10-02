package animals;

public class Mammal extends Animal
{
    public Mammal(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    public String move()
    {
        return "Walk";
    }

    public String breath()
    {
        return "Lungs";
    }

    public String reproduce()
    {
        return "Live births";
    }
}