public class User {
    private String name;
    private String role;

    //constructor
    public User(String name, String role){
        this.name = name;
        this.role = role;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }

    //displayInfo
    public void displayInfo(){
        System.out.println("NAME: " + name + " ROLE: " +  role);
    }
}