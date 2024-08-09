import java.util.ArrayList;
import java.util.List;

public class WhiskersMain{
    public static void main(String[] args){
        List <Pet> petStorage = new ArrayList<>();
        petStorage.add(new Pet("Ginger", 5, "AVAILABLE"));
        petStorage.add(new Pet("Tommy", 8, "PENDING"));
        petStorage.add(new Pet("Ginger", 5, "UNAVAILABLE"));

        for(Pet pet : petStorage){
            pet.displayInfo();
        }
        System.out.println("===========================");

        User user1 = new User("Ram", "admin");
        user1.displayInfo();
    }
}