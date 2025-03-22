package Module3.Homework.Lesson2;

public class Robot implements Action{
    public int canRunDistance;
    public int canJumpDistance;


    public Robot(int canRunDistance, int canJumpDistance) {
        this.canRunDistance = canRunDistance;
        this.canJumpDistance = canJumpDistance;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (this.canRunDistance > treadmill.lengthTreadmill) {
            System.out.println("Робот прошел беговую дорожку");
        } else {
            System.out.println("Робот не прошел беговую дорожку");
        }
    }

    @Override
    public void jump(Wall wall) {

        if (this.canJumpDistance > wall.heightWall) {
            System.out.println("Робот прошел стену");
        } else {
            System.out.println("Робот не прошел стену");
        }
    }

}
