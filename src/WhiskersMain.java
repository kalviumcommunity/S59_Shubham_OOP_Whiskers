import animals.Pet;
import animals.options.*;
import users.User;
import users.options.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhiskersMain{
    private static List <Pet> petStorage = new ArrayList<>();
    private static List <Pet> adoptionRequests = new ArrayList<>();
    private static List <User> userslist = new ArrayList<>();

    public static void userGuide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Here are the controls:");
        System.out.println("Press 1 to register as a user:");
        System.out.println("Press 2 to see all the available pets:");
        System.out.println("Press 3 to see all the users:");
        System.out.println("Press 4 to see all the guides for help:");
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
                userGuide();
                break;
            default:
                System.out.println("No option selected. Terminating the store.");
                return;
        }
    }
    public static void initStore(){
        petStorage.add(new Cat("Ginger", 5, "AVAILABLE", "Siamese"));
        petStorage.add(new Dog("Tommy", 8, "AVAILABLE", "beagle"));
        petStorage.add(new Dog("Scooby", 10, "AVAILABLE", "Bulldog"));
        petStorage.add(new Dog("Charlie", 9, "AVAILABLE", "Labrador"));
        petStorage.add(new Cat("Dave", 11, "AVAILABLE", "Sphinx"));
        petStorage.add(new Bird("Twitter", 11, "AVAILABLE", "African Grey", "Parrot"));
        petStorage.add(new Bird("Hayes", 11, "AVAILABLE", "Ring-Necked", "Dove"));
        Pet.setNumberOfPets(7);
        Pet.setNumberOfPetsAvailable(7);
    }

    public static void showAvailablePets(){
        System.out.println("We have around " + Pet.getNumberOfPets() + " pets available in our store!");
        System.out.println("Following is the list of them:");
        for(Pet pet : petStorage){
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
        newUser.success();
        userGuide();
    }

    public static void main(String[] args){
        initStore();
        System.out.println("=================================================");
        System.out.println("Welcome to Whiskers: A terminal-based application");
        userGuide();
    }
}