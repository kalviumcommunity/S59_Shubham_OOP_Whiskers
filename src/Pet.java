public class Pet {
    private String name;
    private int age;
    private String adoptionStatus;

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
    public void setName(String newName) {
        name = newName;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void setAdoptionStatus(String newAdoptionStatus) {
        adoptionStatus = newAdoptionStatus;
    }

    //displayInfo
    public void displayInfo(){
        System.out.println("NAME: " + name + " AGE: " + age + " ADOPTION STATUS: " + adoptionStatus);
    }
}