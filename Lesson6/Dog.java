package Lesson6;

public class Dog extends Animal {
    public String nameDog;

    public Dog(int swimmingDistance, int runningDistance, String nameDog) {
        super(swimmingDistance, runningDistance);
        this.nameDog = nameDog;

    }


    @Override
    public void swim(int swimmingDistance) {
        if (swimmingDistance <= 10) {
            System.out.println(nameDog + " проплыл " + swimmingDistance + " метров");
        } else {
            System.out.println(nameDog + " не может проплыть " + swimmingDistance + " метров");
        }
    }

    @Override
    public void run(int runningDistance) {
        if (runningDistance <= 500) {
            System.out.println(nameDog + " пробежал " + runningDistance + " метров");
        } else {
            System.out.println(nameDog + " не может пробежать " + runningDistance + " метров");
        }
    }
}
