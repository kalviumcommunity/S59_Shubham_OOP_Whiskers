package animals.options;

import animals.Pet;

public class Dog extends Pet {
    public Dog(String name, int age, String adoptionStatus, String breed) {
        super(name, age, adoptionStatus, breed);
        this.kind = "Dog";
    }
    @Override
    public void makeSound(){
        System.out.println(name + " says: Boof! Boof!" );
    }
}
