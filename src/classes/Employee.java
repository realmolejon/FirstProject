package classes;

/**
 * Created by JPMPC-B212 on 2/17/2017.
 */
public class Employee extends Person {
    String department;
    int payGrade;
    String employeeId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(int payGrade) {
        this.payGrade = payGrade;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String introduceYourself(String fname, String lname) {
        return String.format("Hello, I'm an employee and my name is %s %s",fname, lname);}

    public String introduceYourself(String fname, String lname, int age) {
        return String.format("Hello, I'm an employee and my name is %s %s. I'm %d years old",fname, lname, age);}

    public String introduceYourself(String fname, int age) {
        return String.format("Hello, I'm %s, an employee and I'm %d years old.",fname, age);}
}
