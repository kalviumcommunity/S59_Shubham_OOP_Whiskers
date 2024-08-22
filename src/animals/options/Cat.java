package animals.options;
import animals.Pet;

public class Cat extends Pet {
    public Cat (String name, int age, String adoptionStatus, String breed, String kind){
        super(name, age, adoptionStatus, breed, kind);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " says: Meow! Meow!" );
    }
}
