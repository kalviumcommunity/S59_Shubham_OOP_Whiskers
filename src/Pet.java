public class Pet {
    private String name;
    private int age;
    private String adoptionStatus;

    //constrcutors
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
        System.out.println("NAME: " + name + " AGE: " + age + " ADOPTION STATUS: " + adoptionStatus);
    }
}