package Lesson6;

public class Cat extends Animal {

    public String nameCat;

    public Cat(int swimmingDistance, int runningDistance, String nameCat) {
        super(swimmingDistance, runningDistance);
        this.nameCat = nameCat;

    }

    @Override
    public void swim(int swimmingDistance) {
        System.out.println(nameCat + " не умеет плавать!!");
    }

    @Override
    public void run(int runningDistance) {
        if (runningDistance <= 100) {
            System.out.println(nameCat + " пробежал " + runningDistance + " метров");
        } else {
            System.out.println(nameCat + " не может пробежать " + runningDistance + " метров");
        }
    }
}
