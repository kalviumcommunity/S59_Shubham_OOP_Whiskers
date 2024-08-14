public class Pet {
    private String name;
    private int age;
    private String adoptionStatus;
    static int numberOfPets;
    static int numberOfPetsAvailable;
    static int numberOfPetsPending;
    static int numberOfPetsUnavailable;

    //constructor
    public Pet (String name, int age, String adoptionStatus){
        this.name = name;
        this.age = age;
        this.adoptionStatus = adoptionStatus;
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

    //displayInfo
    public void displayInfo(){
        System.out.println("NAME: " + name + " | AGE: " + age + " | ADOPTION STATUS: " + adoptionStatus);
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
}