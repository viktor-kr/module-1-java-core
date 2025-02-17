package Lesson6;

public class Dog extends Animal {
    public String nameDog;

    public Dog(int swimmingDistance, int runningDistance, String nameDog) {
        super(swimmingDistance, runningDistance);
        this.nameDog = nameDog;

    }


    @Override
    public String swim(int swimmingDistance) {
        if (swimmingDistance <= 10) {
            return nameDog + " проплыл " + swimmingDistance + " метров";
        } else {
            return nameDog + " не может проплыть " + swimmingDistance + " метров";
        }
    }

    @Override
    public String run(int runningDistance) {
        if (runningDistance <= 500) {
            return nameDog + " пробежал " + runningDistance + " метров";
        } else {
            return nameDog + " не может пробежать " + runningDistance + " метров";
        }
    }
}
