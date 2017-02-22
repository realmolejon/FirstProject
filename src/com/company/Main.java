package com.company;

import classes.Customer;
import classes.Employee;
import classes.Person;

public class Main {

    public static void main(String[] args) {

        //first user
        Person firstUser = new Person();
        firstUser.setUserName("amolejon");
        firstUser.setFirstName("Arriel");
        firstUser.setLastName("Molejon");
        firstUser.setEmail("realmolejon@gmail.com");
        firstUser.setAge(24);
        firstUser.setPassword("********1");

        String fname1 = firstUser.getFirstName();
        String lname1 = firstUser.getLastName();
        String email1 = firstUser.getEmail();
        int age1 = firstUser.getAge();

        //second user
        Person secondUser = new Person();
        //secondUser.getDepartment("HR");
        secondUser.setUserName("sgabriel");
        secondUser.setFirstName("Shawn Gabriel");
        secondUser.setLastName("Molejon");
        secondUser.setEmail("sgabrielmolejon@yahoo.com");
        secondUser.setAge(25);
        secondUser.setPassword("********2");

        //String fname2 = secondUser.getFirstName();
        //String lname2 = secondUser.getLastName();
        //String email2 = secondUser.getEmail();
        //int age2 = secondUser.getAge();

        //third user
        Person thirdUser = new Person();
        thirdUser.setUserName("shine");
        thirdUser.setFirstName("Shine");
        thirdUser.setLastName("Molejon");
        thirdUser.setEmail("sunshine@yahoo.com");
        thirdUser.setAge(27);
        thirdUser.setPassword("********3");

        String fname3 = thirdUser.getFirstName();
        String lname3 = thirdUser.getLastName();
        String email3 = thirdUser.getEmail();
        int age3 = thirdUser.getAge();

        //Employee
        Employee employee = new Employee();
        employee.setDepartment("Data Processor II");
        employee.setPayGrade(5);
        employee.setEmployeeId("926558");

        //Customer
        //Customer customer = new Customer();
        Customer customer = new Customer("Chris", "Wayne", "cwaynecom@yahoo,com");
        customer.setFirstName("Shine");
        customer.setLastName("Molejon");
        customer.setAddress("IBO Lapu Lapu City");
        customer.setTelephone(4221951);
        customer.setCustumerId(3212345);

        System.out.println("******First User******");
        System.out.println("USER NAME: " + firstUser.getUserName());
        System.out.println("FIRST NAME: " + fname1);
        System.out.println("LAST NAME: " + lname1);
        System.out.println("EMAIL: " + email1);
        System.out.println("PASSWORD: " + firstUser.getPassword());
        System.out.println("AGE: " + age1);
        System.out.println("");
/*
        System.out.println("******Second User******");
        System.out.println("FIRST NAME: " + fname2);
        System.out.println("LAST NAME: " + lname2);
        System.out.println("EMAIL: " + email2);
        System.out.println("AGE: " + age2);
        System.out.println("");
*/
        System.out.println("******Second User******");
        System.out.println("USER NAME: " + secondUser.getUserName());
        System.out.println("FIRST NAME: " + secondUser.getFirstName());
        System.out.println("LAST NAME: " + secondUser.getLastName());
        System.out.println("EMAIL: " + secondUser.getEmail());
        System.out.println("PASSWORD: " + secondUser.getPassword());
        System.out.println("AGE: " + secondUser.getAge());
        System.out.println("");

        System.out.println("******Third User******");
        System.out.println("USER NAME: " + thirdUser.getUserName());
        System.out.println("FIRST NAME: " + fname3);
        System.out.println("LAST NAME: " + lname3);
        System.out.println("EMAIL: " + email3);
        System.out.println("PASSWORD: " + thirdUser.getPassword());
        System.out.println("AGE: " + age3);
        System.out.println("");

        System.out.println("******Employee******");
        System.out.println("USER NAME: " + firstUser.getUserName());
        System.out.println("FIRST NAME: " + fname1);
        System.out.println("LAST NAME: " + lname1);
        System.out.println("EMAIL: " + email1);
        System.out.println("PASSWORD: " + firstUser.getPassword());
        System.out.println("DEPARTMENT: " + employee.getDepartment());
        System.out.println("PAY GRADE: " + employee.getPayGrade());
        System.out.println("EMPLOYEE ID: " + employee.getEmployeeId());
        System.out.println("");

        System.out.println("******Customer******");
        System.out.println("USER NAME: " + thirdUser.getUserName());
        //System.out.println("FIRST NAME: " + thirdUser.getFirstName());
        //System.out.println("LAST NAME: " + thirdUser.getLastName());
        System.out.println("FIRST NAME: " + customer.getFirstName());
        System.out.println("LAST NAME: " + customer.getLastName());
        //System.out.println("EMAIL: " + thirdUser.getEmail());
        System.out.println("EMAIL: " + customer.getEmail());
        System.out.println("PASSWORD: " + thirdUser.getPassword());
        System.out.println("ADDRESS: " + customer.getAddress());
        System.out.println("TELEPHONE: " + customer.getTelephone());
        System.out.println("CUSTOMER ID: " + customer.getCustumerId());
        System.out.println("");

//        System.out.println(firstUser.introduceYourself("Arriel", "Molejon", 24));
//        System.out.println(customer.introduceYourself("Shawn Gabriel", "Molejon"));
//        System.out.println(employee.introduceYourself("Sunshine", "Molejon", "IBO, Lapu Lapu"));

        System.out.println(firstUser.introduceYourself("Arriel", "Molejon"));
//        System.out.println(employee.introduceYourself("Sunshine", "Molejon", 25));
        System.out.println(employee.introduceYourself("Sunshine", 25));
        System.out.println(customer.introduceYourself("Shawn Gabriel", "Molejon", "Lapu Lapu City"));
/*
        byte byteNumber = 127;
        int firstNumber = 1;
        long longNumber = 1L;
        float floatNumber = 3.14f;
        double doubleNumber = 3.23231d;
        char charVariable = 'd';
        boolean booleanVariable = true;
        String stringValue = "This is a String";
*/

        //integer can't store long value
        //char can't store string value
        //String text = 'c';
        //long longnum = 1;
        //char character = "This is a string";

/*
        System.out.println("Number: " + firstNumber);
        System.out.println("Byte: " + byteNumber);
        System.out.println("Long: " + longNumber);
        System.out.println("Float : " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Char: " + charVariable);
        System.out.println("Boolean: " + booleanVariable);
        System.out.println("String: " + stringValue);
        System.out.println("");
*/

   //   System.out.println("String: " + text);
   //   System.out.println("Long: " + longnum);
   //   System.out.println("Char: " + character);

        /*
        if (byteNumber == 127)

            System.out.println("Byte Number is 127!");
        else
            System.out.println("Byte Number is not 127");
        */
    }
}