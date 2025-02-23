package Lesson6;

public class PrintAnimals {


    public static void main(String[] args) {

        Dog dog = new Dog("Шарик", 10, 500);
        Cat cat = new Cat("Мурзик", 0, 200);
        System.out.println(dog.swim(dog.swimmingDistance) + '\n' + dog.run(dog.runningDistance) + '\n' +
                cat.run(cat.runningDistance));

    }

}
