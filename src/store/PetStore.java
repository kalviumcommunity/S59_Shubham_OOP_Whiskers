package store;

import animals.Pet;

import java.util.ArrayList;
import java.util.List;

//the class implements the interface
public class PetStore implements PetStoreInterface {
    private List<Pet> petStore = new ArrayList<>();

    public void addPet(Pet pet) {
        petStore.add(pet);
    }

    public void removePet(Pet pet){
        petStore.remove(pet);
    }

    public boolean hasPet(Pet pet){
        return petStore.contains(pet);
    }

    public List<Pet> getPetStore() {
        return petStore;
    }
}
