package adoption;

import animals.Pet;
import users.options.*;
import animals.options.*;

import java.util.UUID;

public class AdoptionRequest {
    private final String requestId;
    private final Pet pet;
    private String status;

    public AdoptionRequest(Pet pet){
        this.requestId = UUID.randomUUID().toString();
        this.pet = pet;
        this.status = "PENDING";
    }

    public void approve(){
        this.status = "APPROVED";
    }

    public Pet getPet() {
        return pet;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
