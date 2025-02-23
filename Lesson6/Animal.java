package Lesson6;

public class Animal {

public  String nameAnimal;
    public int swimmingDistance;
    public int runningDistance;

    public Animal(String nameAnimal, int swimmingDistance, int runningDistance) {
        this.swimmingDistance = swimmingDistance;
        this.runningDistance = runningDistance;
        this.nameAnimal=nameAnimal;
    }
    public String swim(int distanceSwimDog) {
        if (swimmingDistance <= distanceSwimDog) {
            return nameAnimal + " проплыл " + swimmingDistance + " метров";
        } else {
            return nameAnimal + " не может проплыть " + swimmingDistance + " метров";
        }
    }

    public String run(int runningDistance) {
        if (runningDistance <= runningDistance) {
            return nameAnimal + " пробежал " + runningDistance + " метров";
        } else {
            return nameAnimal + " не может пробежать " + runningDistance + " метров";
        }
    }


}

