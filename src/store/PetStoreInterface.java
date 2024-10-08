package store;

import animals.Pet;

import java.util.List;

public interface PetStoreInterface {
    void addPet(Pet pet);
    void removePet(Pet pet);
    boolean hasPet(Pet pet);
    List<Pet> getPetStore();
}
