package classes;

/**
 * Created by JPMC-PC11 on 17/02/2017.
 */
public class Customer extends Person {
    //private String fname;
    //private String lname;
    String address;
    int telephone;
    int custumerId;

    public Customer() {
    }

    public Customer(String fname, String lname, String email) {
        this.firstName = fname;
        this.lastName = lname;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getCustumerId() {
        return custumerId;
    }

    public void setCustumerId(int custumerId) {
        this.custumerId = custumerId;
    }

    public String introduceYourself(String fname, String lname) {
        return String.format("Hello, I'm a customer and my name is %s %s",fname, lname);}

    public String introduceYourself(String fname, String lname, String address) {
        return String.format("Hello, I'm a customer, my name is %s %s and I live in %s", fname, lname, address);}

 }
