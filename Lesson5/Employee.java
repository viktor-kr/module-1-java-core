package Lesson5;

import java.util.Arrays;

public class Employee {
    String fullName;
    String jobТitle;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String jobТitle, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.jobТitle = jobТitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public String emploeeInformation() {
        return fullName + '\n' + jobТitle + '\n' + email + '\n' +
                phoneNumber + '\n' + salary + '\n' + age;
    }

    public int emploeeAge() {
        return age;
    }

    public static void main(String[] args) {


        Employee[] emploeeArray = new Employee[5];
        emploeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 33);

        emploeeArray[1] = new Employee("Erohof Oleg", "Senior Engineer", "olegn@mailbox.com",
                "892312355", 90000, 50);
        emploeeArray[2] = new Employee("Petrov Andry", "QA", "petr@mailbox.com",
                "892312366", 100000, 40);
        emploeeArray[3] = new Employee("Sidorov Kumar", "Project Manager", "kumar@mailbox.com",
                "892312772", 130000, 55);
        emploeeArray[4] = new Employee("Gorelov Zakir", "CPO", "zakir@mailbox.com",
                "892312777", 230000, 22);
        for (int i = 1; i < emploeeArray.length; i++) {
            if (emploeeArray[i].emploeeAge() > 40) {
                System.out.println(emploeeArray[i].emploeeInformation());
            }
        }
    }
}