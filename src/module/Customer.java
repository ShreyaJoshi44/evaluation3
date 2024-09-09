package module;

public class Customer {
    private String name;
    private int customerID;
    private String email;

    public Customer(String name, int customerID, String email) {
        this.name = name;
        this.customerID = customerID;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
