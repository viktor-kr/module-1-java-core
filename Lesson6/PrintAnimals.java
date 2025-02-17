package Lesson6;

public class PrintAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog(100, 1500, "Шарик");
        Cat cat = new Cat(0, 1500, "Мурзик");
        System.out.println(dog.swim(10) + '\n' + dog.run(500) + '\n' +
                cat.run(200));

    }

}
