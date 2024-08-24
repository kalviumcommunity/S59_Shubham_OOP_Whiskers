package animals.options.reptiles;

import animals.options.Reptile;

public class Lizard extends Reptile {
    private String habitat;
    public Lizard(String name, int age, String adoptionStatus, String breed, String kind, boolean isVenomous, String habitat){
        super(name, age, adoptionStatus, breed, kind, isVenomous);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " makes a lizardy sound!");
    }
}
