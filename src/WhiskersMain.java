import adoption.AdoptionRequest;
import adoption.AdoptionService;
import animals.Pet;
import animals.options.*;
import store.PetStore;
import users.User;
import users.options.*;
import animals.options.reptiles.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhiskersMain{
    private static PetStore petStore = new PetStore();
    private static List <User> userslist = new ArrayList<>();

    public static void userGuide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Here are the controls:");
        System.out.println("Press 1 to register as a user:");
        System.out.println("Press 2 to see all the available pets:");
        System.out.println("Press 3 to see all the users:");
        System.out.println("Press 4 to add a pet:");
        System.out.println("Press 5 to adopt a pet:");
        System.out.println("Press 6 to see all the guides for help:");
        System.out.println("Any other key to end the store:");
        int signal = scanner.nextInt();
        switch(signal){
            case 1 :
                newUser();
                break;
            case 2 :
                showAvailablePets();
                break;
            case 3:
                showAllUsers();
                break;
            case 4:
                petSelection();
                break;
            case 5:
                adoptPet();
                break;
            case 6:
                userGuide();
                break;
            default:
                System.out.println("No option selected. Terminating the store.");
                return;
        }
    }
    public static void initStore(){
        petStore.addPet(new Dog());
        petStore.addPet(new Cat("Ginger", 5, "AVAILABLE", "Siamese", "Cat"));
        petStore.addPet(new Dog("Tommy", 8, "AVAILABLE", "beagle", "Dog"));
        petStore.addPet(new Snake("Fissy", 11, "AVAILIABLE", "Burmese Python", "Snake", false, "Diamond"));
        petStore.addPet(new Crocodile("Crocs", 7, "AVAILIABLE", "Indian", "Crocodile", false, false));
        petStore.addPet(new Dog("Scooby", 10, "AVAILABLE", "Bulldog", "Dog"));
        petStore.addPet(new Dog("Charlie", 9, "AVAILABLE", "Labrador", "Dog"));
        petStore.addPet(new Cat("Dave", 11, "AVAILABLE", "Sphinx", "Cat"));
        petStore.addPet(new Bird("Twitter", 11, "AVAILABLE", "African Grey", "Parrot"));
        petStore.addPet(new Bird("Hayes", 11, "AVAILABLE", "Ring-Necked", "Dove"));
        Pet.setNumberOfPets(7);
        Pet.setNumberOfPetsAvailable(7);
    }

    public static void showAvailablePets(){
        System.out.println("We have around " + Pet.getNumberOfPets() + " pets available in our store!");
        System.out.println("Following is the list of them:");
        List<Pet> petlist = petStore.getPetStore();
        for(Pet pet : petlist){
            pet.displayInfo();
            pet.makeSound();
        }
        userGuide();
    }

    public static void showAllUsers() {
        System.out.println("We have around " + User.getNumberOfUsers() + " users!");
        System.out.println("Following is the list of them:");
        for (User user : userslist) {
            user.displayInfo();
        }
        userGuide();
    }

        public static void newUser(){
        System.out.println("=================================================");
        System.out.println("Enter info for new user registration:");
        System.out.println("=================================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your role:");
        System.out.println("1: Admin");
        System.out.println("2: Customer");
        int role = scanner.nextInt();
        User newUser;
        if(role == 1){
            newUser = new Admin(name);
        }
        else if(role == 2){
            newUser = new Customer(name);
        }
        else{
            System.out.println("Invalid Input. Try again later.");
            return;
        }
        userslist.add(newUser);
        User.setNumberOfUsers(User.getNumberOfUsers() + 1);
        User.setNumberOfUsers(User.getNumberOfUsers() + 1);
        newUser.success();
        userGuide();
    }

    public static void addPet(int signal){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = scanner.nextLine();
        System.out.print("Enter the age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the breed:");
        String breed = scanner.nextLine();
        Pet newPet;
        if(signal == 1){
            newPet = new Dog(name, age, "AVAILABLE", breed, "Dog");
        }
        else if(signal == 2){
            newPet = new Cat(name, age, "AVAILABLE", breed, "Cat");
        }
        else if(signal == 3){
            System.out.println("Enter its kind (eg. Piegon, Dove..): ");
            String kind = scanner.nextLine();
            newPet = new Bird(name, age, "AVAILABLE", breed, kind);
        }
        else{
            System.out.println("Is it Venomous? (Enter true/false (lowercase)): ");
            boolean isVenomous = scanner.nextBoolean();
            scanner.nextLine();
            if(signal == 4){
                System.out.print("Enter the scale pattern:");
                String scalePattern = scanner.nextLine();
                newPet = new Snake(name, age, "AVAILABLE", breed, "Snake", isVenomous, scalePattern);
            }
            else if(signal == 5){
                System.out.print("Enter the habitat:");
                String habitat = scanner.nextLine();
                newPet = new Lizard(name, age, "AVAILABLE", breed, "Crocodile", isVenomous, habitat);
            }
            else if(signal == 6){
                System.out.print("Does it generally live in freshwater (Enter true/false (lowercase)): ");
                boolean isFreshwater = scanner.nextBoolean();
                scanner.nextLine();
                newPet = new Crocodile(name, age, "AVAILABLE", breed, "Lizard", isVenomous, isFreshwater);
            }
            else{
                System.out.println("Wrong input. Exiting. ");
                return;
            }
        }
        petStore.addPet(newPet);
        System.out.println("Added successfully!");
    }

    public static void petSelection(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Here are the controls:");
        System.out.println("Press 1 to add a dog:");
        System.out.println("Press 2 to add a cat:");
        System.out.println("Press 3 to add a bird:");
        System.out.println("Press 4 to add a snake:");
        System.out.println("Press 5 to add a lizard:");
        System.out.println("Press 6 to add a crocodile:");
        System.out.println("Any other key to come back:");
        int signal = scanner.nextInt();
        if(signal <= 6){
            addPet(signal);
        }
        userGuide();
    }

    public static void adoptPet(){
        System.out.println("Enter the name of the one you wish to adopt:");
        Scanner scanner = new Scanner(System.in);
        String petInput = scanner.nextLine();
        Pet petToAdopt = getPetByName(petInput);
        if(petToAdopt != null){
            AdoptionRequest adoptionRequest = new AdoptionRequest(petToAdopt);
            AdoptionService adoptionService = new AdoptionService();
            adoptionService.adoptPet(petStore, adoptionRequest);
            adoptionRequest.approve();
        } else{
            System.out.println(petInput + " doesn't exist!");
        }
        userGuide();
    }

    public static Pet getPetByName(String name){
        List <Pet> petList = petStore.getPetStore();
        for(Pet p : petList){
            if(p.getName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }


    public static void main(String[] args){
        initStore();
        System.out.println("=================================================");
        System.out.println("Welcome to Whiskers: A terminal-based application");
        userGuide();
    }
}