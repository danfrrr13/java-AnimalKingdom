package animals;

import java.util.*;

public class Main
{
    public static ArrayList<Animal> filteredList = new ArrayList<Animal>();
    public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester)
    {
        filteredList.clear();

        for (Animal a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName() + " was discovered in " + a.getYear());
                filteredList.add(a);
            }
        }
    }
    public static void main(String[] args)
    {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);
        
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<Animal> myList = new ArrayList<Animal>();

        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);

        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);

        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        System.out.println("\n*** myList of Animals ***\n");
        printAnimals(myList, a -> true);

        System.out.println("\n*** sorted by year descending ***\n");
        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        printAnimals(myList, a -> true);

        System.out.println("\n*** sorted alphabetically ***\n");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(myList, a -> true);

        System.out.println("\n*** sorted by move ***\n");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        printAnimals(myList, a -> true);

        System.out.println("\n*** breathe with lungs ***\n");
        printAnimals(myList, a -> a.breath() == "Lungs");

        System.out.println("\n*** breathe with lungs && named in 1758 ***\n");
        printAnimals(myList, a -> (a.breath() == "Lungs") && (a.getYear() == 1758));

        System.out.println("\n*** breathe with lungs && lay eggs ***\n");
        printAnimals(myList, a -> (a.breath() == "Lungs") && (a.reproduce() == "Eggs"));

        System.out.println("\n*** sorted alphabetically && named in 1758 ***\n");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(myList, a -> a.getYear() == 1758);

        System.out.println("\n*** sorted alphabetically && mammals only ***\n");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(myList, a -> a instanceof Mammal);
    }
}