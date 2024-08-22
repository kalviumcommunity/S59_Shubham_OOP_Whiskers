package animals.options.reptiles;

import animals.options.Reptile;

public class Crocodile extends Reptile {
    private boolean isFreshWater;
    public Crocodile(String name, int age, String adoptionStatus, String breed, String kind, boolean isVenomous, boolean isFreshWater){
        super(name, age, adoptionStatus, breed, kind, isVenomous);
        this.isFreshWater = isFreshWater;
    }

    public boolean getIsFreshWater() {
        return isFreshWater;
    }

    public void setIsFreshWater(boolean isFreshWater) {
        this.isFreshWater = isFreshWater;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " roars!");
    }
}
