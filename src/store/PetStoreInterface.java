package store;

import animals.Pet;
import java.util.List;

//interface for pet stores
public interface PetStoreInterface {
    void addPet(Pet pet);
    void removePet(Pet pet);
    boolean hasPet(Pet pet);
    List<Pet> getPetStore();
}
