package animals;

public abstract class Animal
{
    protected int maxId;
    protected int id;
    protected String name;
    protected int yearDiscovered;

    public Animal(String name, int yearDiscovered)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return yearDiscovered;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
}