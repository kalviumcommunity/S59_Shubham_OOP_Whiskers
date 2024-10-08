package adoption;

import animals.Pet;
import store.PetStoreInterface;

public class AdoptionService {
    public void adoptPet(PetStoreInterface petStore, AdoptionRequest adoptionRequest){
        Pet petToAdopt = adoptionRequest.getPet();
        if(petToAdopt.getAdoptionStatus().equals("AVAILABLE") && petStore.hasPet(petToAdopt)){
            petStore.removePet(petToAdopt);
            System.out.println("Congrats 🎉, You have adopted " + petToAdopt.getName() + ". Take care!");
            petToAdopt.setAdoptionStatus("UNAVAILABLE");
        }
        else {
            System.out.println(petToAdopt.getName() + " not available!");
        }

    }
}
