import animals.Pet;
import animals.options.*;

import java.util.ArrayList;
import java.util.List;

public class WhiskersMain{

    public static void initStore(List <Pet> petStorage){
        petStorage.add(new Cat("Ginger", 5, "AVAILABLE", "Siamese"));
        petStorage.add(new Dog("Tommy", 8, "AVAILABLE", "beagle"));
        petStorage.add(new Dog("Scooby", 10, "AVAILABLE", "Bulldog"));
        petStorage.add(new Dog("Charlie", 9, "AVAILABLE", "Labrador"));
        petStorage.add(new Cat("Dave", 11, "AVAILABLE", "Sphinx"));
        petStorage.add(new Bird("Twitter", 11, "AVAILABLE", "African Grey", "Parrot"));
        petStorage.add(new Bird("Hayes", 11, "AVAILABLE", "Ring-Necked", "Dove"));
        Pet.setNumberOfPets(7);
        Pet.setNumberOfPetsAvailable(7);
    }

    public static void main(String[] args){
        List <Pet> petStorage = new ArrayList<>();
        initStore(petStorage);
        System.out.println("=================================================");
        System.out.println("Welcome to Whiskers: A terminal-based application");
        System.out.println("=================================================");
        System.out.println("We have around " + Pet.getNumberOfPets() + " pets available in our store!");
        System.out.println("Following is the list of them:");
        for(Pet pet : petStorage){
            pet.displayInfo();
            pet.makeSound();
        }
    }
}