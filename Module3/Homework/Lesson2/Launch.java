package Module3.Homework.Lesson2;

public class Launch {

    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(5);
        Wall wall = new Wall(2);
        Action[] participants = {new Human(3, 1),
                new Cat(3, 2),
                new Robot(5, 4)};


       for (int i=0; i < participants.length ; i++){
           participants[i].run(treadmill);
        participants[i].jump(wall);
       }

    }

}
