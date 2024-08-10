import java.util.ArrayList;
import java.util.List;

public class WhiskersMain{

    public static void initStore(List <Pet> petStorage){
        petStorage.add(new Pet("Ginger", 5, "AVAILABLE"));
        petStorage.add(new Pet("Tommy", 8, "PENDING"));
        petStorage.add(new Pet("Scooby", 10, "PENDING"));
        petStorage.add(new Pet("Charlie", 9, "AVAILABLE"));
        petStorage.add(new Pet("Dave", 11, "UNAVAILABLE"));
        Pet.numberOfPets = 5;
        Pet.numberOfPetsAvailable = 2;
        Pet.numberOfPetsPending = 2;
        Pet.numberOfPetsUnavailable = 1;
    }

    public static void main(String[] args){
        List <Pet> petStorage = new ArrayList<>();
        initStore(petStorage);
        for(Pet pet : petStorage){
            pet.displayInfo();
        }
        System.out.println("===========================");
        User user1 = new User("Ram", "admin");
        user1.displayInfo();
    }
}