package animals.options;

import animals.Pet;

public class Bird extends Pet {
    public Bird(String name, int age, String adoptionStatus, String breed, String kind){
        super(name, age, adoptionStatus, breed, kind);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " says: Tweet! Tweet!" );
    }
}
