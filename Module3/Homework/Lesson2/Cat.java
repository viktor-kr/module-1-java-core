package Module3.Homework.Lesson2;

public class Cat implements Action {

    public int canRunDistance;
    public int canJumpDistance;

    public Cat(int canRunDistance, int canJumpDistance) {
        this.canRunDistance = canRunDistance;
        this.canJumpDistance = canJumpDistance;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (this.canRunDistance > treadmill.lengthTreadmill) {
            System.out.println("Кот прошел беговую дорожку");
        } else {
            System.out.println("Кот не прошел беговую дорожку");
        }
    }

    @Override
    public void jump(Wall wall) {

        if (this.canJumpDistance > wall.heightWall) {
            System.out.println("Кот прошел стену");
        } else {
            System.out.println("Кот не прошел стену");
        }
    }

}
