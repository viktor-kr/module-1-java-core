package Lesson6;

public class Animal {
    public int swimmingDistance;
    public int runningDistance;

    public Animal(int swimmingDistance, int runningDistance) {
        this.swimmingDistance = swimmingDistance;
        this.runningDistance = runningDistance;
    }

    public void swim(int swimmingDistance) {

    }

    public void run(int runningDistance) {

    }

    public static void main(String[] args) {
        Dog dog = new Dog(100, 1500, "Шарик");
        Cat cat = new Cat(10, 1000, "Мурзик");
        dog.swim(dog.swimmingDistance);
        dog.run(dog.runningDistance);
        cat.run(cat.runningDistance);
        cat.swim(dog.swimmingDistance);
    }
}

