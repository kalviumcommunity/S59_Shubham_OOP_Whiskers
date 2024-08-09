public class User {
    private String name;
    private String role;

    //getters
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }

    //setters
    public void setName(String newName) {
        name = newName;
    }
    public void setRole(String newRole) {
        role = newRole;
    }

    //displayInfo
    public void displayInfo(){
        System.out.println("NAME: " + name + " ROLE: " +  role);
    }
}