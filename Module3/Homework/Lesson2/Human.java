package Module3.Homework.Lesson2;



public class Human implements Action {
   int canRunDistance;
    int canJumpDistance;

    public Human(int canRunDistance, int canJumpDistance) {
        this.canRunDistance = canRunDistance;
        this.canJumpDistance = canJumpDistance;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (this.canRunDistance > treadmill.lengthTreadmill) {
            System.out.println("Человек прошел беговую дорожку");
        } else {
            System.out.println("Человек не прошел беговую дорожку");
        }
    }

    @Override
    public void jump(Wall wall) {

        if (this.canJumpDistance > wall.heightWall) {
        System.out.println("Человек прошел стену");
    } else {
        System.out.println("Человек не прошел стену");
    }
}

}
