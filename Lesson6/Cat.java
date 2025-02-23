package Lesson6;

public class Cat extends Animal {



    public Cat(String nameAnimal, int swimmingDistance, int runningDistance) {
        super(nameAnimal, swimmingDistance, runningDistance);
    }

    public String run(int runningDistance) {
        return super.run(runningDistance);
    }
}
