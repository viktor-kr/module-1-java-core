package Module3.Homework.Lesson2;

public class Wall {

   public int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }


    public void run(Human human) {
        if (human.canRunDistance > heightWall) {
            System.out.println("Робот прошел стену");
        } else {
            System.out.println("Робот не прошел стену");
        }
    }
    public void run (Cat cat){
        if (cat.canRunDistance > heightWall) {
            System.out.println("Робот прошел стену");
        } else {
            System.out.println("Робот не прошел стену");
        }
    }
    public void run (Robot robot){
        if (robot.canRunDistance > heightWall) {
            System.out.println("Робот прошел стену");
        } else {
            System.out.println("Робот не прошел стену");
        }
    }
}





