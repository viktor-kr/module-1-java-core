package Lesson5;

public class LaunchEmploee {
    public static void main(String[] args) {


        Employee[] emploeeInformation = new Employee[5];
        emploeeInformation[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 33);

        emploeeInformation[1] = new Employee("Erohof Oleg", "Senior Engineer", "olegn@mailbox.com",
                "892312355", 90000, 50);
        emploeeInformation[2] = new Employee("Petrov Andry", "QA", "petr@mailbox.com",
                "892312366", 100000, 40);
        emploeeInformation[3] = new Employee("Sidorov Kumar", "Project Manager", "kumar@mailbox.com",
                "892312772", 130000, 55);
        emploeeInformation[4] = new Employee("Gorelov Zakir", "CPO", "zakir@mailbox.com",
                "892312777", 230000, 22);
        for (int i = 0; i < emploeeInformation.length; i++) {
            if (emploeeInformation[i].emploeeAge() > 40) {
                System.out.println(emploeeInformation[i].emploeeInformation());
            }
        }
    }
}