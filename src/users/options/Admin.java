package users.options;

import java.util.UUID;
import users.User;

public class Admin extends User {
    public Admin(String name){
        super(name, "ADMIN");
    }
}
