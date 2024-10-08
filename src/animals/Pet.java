package animals;

//the class is open for extensions but closed for modifications when new kind of pet is added.
public abstract class Pet {
    protected String name;
    protected int age;
    protected String adoptionStatus;
    protected String breed;
    protected  String kind;
    static int numberOfPets;
    static int numberOfPetsAvailable;
    static int numberOfPetsPending;
    static int numberOfPetsUnavailable;
    static String unknownStatus = "Unknown";

    public Pet(){
        this.name = unknownStatus;
        this.age = -1;
        this.adoptionStatus = "AVAILABLE";
        this.breed = unknownStatus;
        this.kind = unknownStatus;
    }

    //constructor
    public Pet (String name, int age, String adoptionStatus, String breed, String kind){
        this.name = name;
        this.age = age;
        this.adoptionStatus = adoptionStatus;
        this.breed = breed;
        this.kind = kind;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAdoptionStatus() {
        return adoptionStatus;
    }
    public String getBreed() {return breed;}
    public String getKind() {
        return kind;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAdoptionStatus(String adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }

    //displayInfo
    public void displayInfo(){
        System.out.println("NAME: " + name + " | KIND: " + kind + " | BREED: " + breed + " | AGE: " + age + " | ADOPTION STATUS: " + adoptionStatus);
    }

    public static int getNumberOfPets() {
        return numberOfPets;
    }
    public static int getNumberOfPetsAvailable() {
        return numberOfPetsAvailable;
    }
    public static int getNumberOfPetsPending() {
        return numberOfPetsPending;
    }
    public static int getNumberOfPetsUnavailable() {
        return numberOfPetsUnavailable;
    }
    public static void setNumberOfPets(int numberOfPets) {
        Pet.numberOfPets = numberOfPets;
    }
    public static void setNumberOfPetsAvailable(int numberOfPetsAvailable) {
        Pet.numberOfPetsAvailable = numberOfPetsAvailable;
    }
    public static void setNumberOfPetsPending(int numberOfPetsPending) {
        Pet.numberOfPetsPending = numberOfPetsPending;
    }
    public static void setNumberOfPetsUnavailable(int numberOfPetsUnavailable) {
        Pet.numberOfPetsUnavailable = numberOfPetsUnavailable;
    }

    public abstract void makeSound();
}