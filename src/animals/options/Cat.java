package animals.options;
import animals.Pet;

public class Cat extends Pet {
    public Cat (String name, int age, String adoptionStatus, String breed){
        super(name, age, adoptionStatus, breed);
        this.kind = "Cat";
    }
    @Override
    public void makeSound(){
        System.out.println(name + " says: Meow! Meow!" );
    }
}
