package Lesson6;

public class Cat extends Animal {

    public String nameCat;

    public Cat(int swimmingDistance, int runningDistance, String nameCat) {
        super(swimmingDistance, runningDistance);
        this.nameCat = nameCat;

    }


    @Override
    public String run(int runningDistance) {
        if (runningDistance <= 200) {
            return nameCat + " пробежал " + runningDistance + " метров";
        } else {
            return nameCat + " не может пробежать " + runningDistance + " метров";
        }
    }
}
