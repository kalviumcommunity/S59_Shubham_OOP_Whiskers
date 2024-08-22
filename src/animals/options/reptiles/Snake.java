package animals.options.reptiles;

import animals.options.Reptile;

public class Snake extends Reptile {
    private String scalePattern;
    
    public Snake(String name, int age, String adoptionStatus, String breed, String kind, boolean isVenomous, String scalePattern){
        super(name, age, adoptionStatus, breed, kind, isVenomous);
        this.scalePattern = scalePattern;
    }

    public String getScalePattern() {
        return scalePattern;
    }

    public void setScalePattern(String scalePattern) {
        this.scalePattern = scalePattern;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " hisses!");
    }
}
