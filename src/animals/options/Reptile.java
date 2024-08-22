package animals.options;

import animals.Pet;

public class Reptile extends Pet {
    protected boolean isVenomous;

    public Reptile (String name, int age, String adoptionStatus, String breed, String kind, boolean isVenomous){
        super(name, age, adoptionStatus, breed, kind);
        this.isVenomous = isVenomous;
    }

    @Override
    public void makeSound(){
        System.out.println(name + "makes a reptile sound!");
    }
    public boolean isVenomous(){
        return isVenomous;
    }
    public void setVenomous(boolean isVenomous) {
        this.isVenomous = isVenomous;
    }
}