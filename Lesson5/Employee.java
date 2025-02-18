package Lesson5;

import java.util.Arrays;

public class Employee {
    String fullName;
    String jobPosition;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String jobPosition, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public String emploeeInformation() {
        return fullName + '\n' + jobPosition + '\n' + email + '\n' +
                phoneNumber + '\n' + salary + '\n' + age;
    }

    public int emploeeAge() {

        return age;
    }


}