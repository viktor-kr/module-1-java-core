package Lesson6;

public class Animal {
    public int swimmingDistance;
    public int runningDistance;

    public Animal(int swimmingDistance, int runningDistance) {
        this.swimmingDistance = swimmingDistance;
        this.runningDistance = runningDistance;
    }

    public String swim(int swimmingDistance) {
        return " проплыл " + swimmingDistance + " метров";
    }

    public String run(int runningDistance) {
        return " пробежал " + runningDistance + " метров";
    }


}

