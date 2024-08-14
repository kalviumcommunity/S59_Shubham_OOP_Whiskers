import java.util.ArrayList;
import java.util.List;

public class WhiskersMain{

    public static void initStore(List <Pet> petStorage){
        petStorage.add(new Pet("Ginger", 5, "AVAILABLE"));
        petStorage.add(new Pet("Tommy", 8, "AVAILABLE"));
        petStorage.add(new Pet("Scooby", 10, "AVAILABLE"));
        petStorage.add(new Pet("Charlie", 9, "AVAILABLE"));
        petStorage.add(new Pet("Dave", 11, "AVAILABLE"));
        Pet.numberOfPets = 5;
        Pet.numberOfPetsAvailable = 5;
        Pet.numberOfPetsPending = 0;
        Pet.numberOfPetsUnavailable = 0;
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
        }
    }
}