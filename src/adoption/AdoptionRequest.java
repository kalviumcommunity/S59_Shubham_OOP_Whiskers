package adoption;

import animals.Pet;
import users.options.*;
import animals.options.*;

public class AdoptionRequest {
    private final String requestId;
    private final Customer customer;
    private final Pet pet;
    private String status;

    public AdoptionRequest(String requestId, Customer customer, Pet pet){
        this.requestId = requestId;
        this.customer = customer;
        this.pet = pet;
        this.status = "PENDING";
    }

    public void approve(){
        this.status = "APPROVED";
    }

    public Customer getCustomer() {
        return customer;
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
