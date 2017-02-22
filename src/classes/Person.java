package classes;

/**
 * Created by JPMPC-B212 on 2/17/2017.
 */

//methods are functions that is available for the class
    //set and get data from the class
    //abstraction
    //override/overload
public class Person {
        String userName;
        String email;
        String firstName;
        String lastName;
        String password;
        int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 //   public String introduceYourself(String fname, String lname, int age) {
 //     return String.format("Hello, I'm %s %s and I'm %d years old", fname, lname, age);}

    public String introduceYourself(String fname, String lname) {
        return String.format("Hello, my name is %s %s",fname, lname);}

}
