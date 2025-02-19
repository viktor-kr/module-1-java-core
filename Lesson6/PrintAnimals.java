package Lesson6;

public class PrintAnimals {


    public static void main(String[] args) {

        Dog dog = new Dog(10, 500, "Шарик");
        Cat cat = new Cat(0, 200, "Мурзик");
        System.out.println(dog.swim(dog.swimmingDistance) + '\n' + dog.run(dog.runningDistance) + '\n' +
                cat.run(cat.runningDistance));

    }

}
