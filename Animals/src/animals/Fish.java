package animals;

public class Fish extends Animal
{
    public Fish(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    public String move()
    {
        return "Swim";
    }

    public String breath()
    {
        return "Gills";
    }

    public String reproduce()
    {
        return "Eggs";
    }
}