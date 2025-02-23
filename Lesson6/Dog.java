package Lesson6;

public class Dog extends Animal {


    public Dog(String nameAnimal, int swimmingDistance, int runningDistance) {
        super(nameAnimal, swimmingDistance, runningDistance);
    }


    public String swim(int distanceSwimDog) {
        return super.swim(distanceSwimDog);
    }


    public String run(int runningDistance) {
        return super.run(runningDistance);
    }
}

