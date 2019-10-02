package animals;

public class Bird extends Animal
{
    public Bird(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    public String move()
    {
        return "Fly";
    }

    public String breath()
    {
        return "Lungs";
    }

    public String reproduce()
    {
        return "Eggs";
    }
}