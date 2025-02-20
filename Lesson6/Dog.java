package Lesson6;

public class Dog extends Animal {
    public String nameDog;
    public int distanceRunDog = 500;
    public static int distanceSwimDog = 10;

    public Dog(int swimmingDistance, int runningDistance, String nameDog) {
        super(swimmingDistance, runningDistance);
        this.nameDog = nameDog;

    }

    public String swim(int swimmingDistance) {
        if (swimmingDistance <= distanceSwimDog) {
            return nameDog + " проплыл " + swimmingDistance + " метров";
        } else {
            return nameDog + " не может проплыть " + swimmingDistance + " метров";
        }
    }

    public String run(int runningDistance) {
        if (runningDistance <= distanceRunDog) {
            return nameDog + " пробежал " + runningDistance + " метров";
        } else {
            return nameDog + " не может пробежать " + runningDistance + " метров";
        }
    }
}
