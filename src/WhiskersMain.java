public class WhiskersMain{
    public static void main(String[] args){
        Pet pet1 = new Pet();
        pet1.setName("Ginger");
        pet1.setAge(5);
        pet1.setAdoptionStatus("adopted");
        pet1.displayInfo();

        System.out.println("===========================");

        User user1 = new User();
        user1.setName("Ram");
        user1.setRole("Admin");
        user1.displayInfo();
    }
}