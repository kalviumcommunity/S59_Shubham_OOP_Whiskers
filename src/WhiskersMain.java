public class WhiskersMain{
    public static void main(String[] args){
        Pet pet1 = new Pet("Ginger", 5, "adopted");
        pet1.displayInfo();

        System.out.println("===========================");

        User user1 = new User("Ram", "admin");
        user1.displayInfo();
    }
}