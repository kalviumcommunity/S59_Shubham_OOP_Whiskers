package users;

import java.util.UUID;

public abstract class User {
    //abstraction
    private String userId;
    private String name;
    private String role;
    private static int numberOfUsers;

    public User(String name, String role){
        this.userId = UUID.randomUUID().toString();
        this.name = name;
        this.role = role;
    }

    //getters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public static int getNumberOfUsers() {
        return numberOfUsers;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public static void setNumberOfUsers(int numberOfUsers) {
        User.numberOfUsers = numberOfUsers;
    }

    public void displayInfo(){
        System.out.println("NAME: " + name + " | ROLE: " + role);
    }
    public void success(){
        System.out.println("Registration success!");
        System.out.println("Your user id is: " + getUserId());
    }
}