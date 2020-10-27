package animalkingdom;

import java.util.*;

public class AnimalKingdom{
    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();

        //Mammals
        animalList.add(new Mammal("Panda", "1869"));
        animalList.add(new Mammal("Zebra", "1778"));
        animalList.add(new Mammal("Koala", "1816"));
        animalList.add(new Mammal("Sloth", "1804"));
        animalList.add(new Mammal("Armadillo", "1758"));
        animalList.add(new Mammal("Racoon", "1758"));
        animalList.add(new Mammal("Bigfoot", "2021"));

        //Birds
        animalList.add(new Bird("Pigeon", "1837"));
        animalList.add(new Bird("Peacock", "1821"));
        animalList.add(new Bird("Toucan", "1758"));
        animalList.add(new Bird("Parrot", "1824"));
        animalList.add(new Bird("Swan", "1758"));

        //Fish
        animalList.add(new Fish("Salmon", "1758"));
        animalList.add(new Fish("Catfish", "1817"));
        animalList.add(new Fish("Perch", "1758"));

        System.out.println(animalList);
    }
}