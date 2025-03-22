package Module3.Homework.Lesson2;

public class Treadmill {

    public int lengthTreadmill;


    public Treadmill(int lengthTreadmill) {
        this.lengthTreadmill = lengthTreadmill;


    }
    public void run(Human human) {
        if (human.canRunDistance > lengthTreadmill) {
            System.out.println("Робот прошел стену");
        } else {
            System.out.println("Робот не прошел стену");
        }
    }
public void run (Cat cat){
    if (cat.canRunDistance > lengthTreadmill) {
        System.out.println("Робот прошел стену");
    } else {
        System.out.println("Робот не прошел стену");
    }
}
    public void run (Robot robot){
        if (robot.canRunDistance > lengthTreadmill) {
            System.out.println("Робот прошел стену");
        } else {
            System.out.println("Робот не прошел стену");
        }
    }

}

