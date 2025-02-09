
public class HomeWorkApp3 {
    public static void main(String[] args) {
        int[] arrayTask1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArrayTask1(arrayTask1);
        createArrayTask2();
        int[] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArrayTask3(arrayTask3);
        fillArrayTask4();
        createArrayTask5(5, 5);
        elementArrayTask6();
    }

    public static void changeArrayTask1(int[] arrayTask1) {
        for (int i = 0; i < arrayTask1.length; i++) {
            if (arrayTask1[i] == 1) {
                arrayTask1[i] = 0;
            } else {
                arrayTask1[i] = 1;
            }

        }

    }

    public static void createArrayTask2() {
        int[] arrayTask2 = new int[100];
        for (int i = 0; i < arrayTask2.length; i++) {
            arrayTask2[i] = i + 1;
        }
    }

    public static void changeArrayTask3(int[] arrayTask3) {
        for (int i = 0; i < arrayTask3.length; i++) {
            if (arrayTask3[i] < 6) {
                arrayTask3[i] *= 2;
            }

        }

    }

    public static void fillArrayTask4() {
        int[][] arrayTask4 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    arrayTask4[i][j] = 1;
                }
                System.out.print(" " + arrayTask4[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int[] createArrayTask5(int len, int initialValue) {
        int[] arrayTask5 = new int[len];
        for (int i = 0; i < arrayTask5.length; i++) {
            arrayTask5[i] = initialValue;

        }

        return arrayTask5;

    }

    public static void elementArrayTask6() {
        int min = 0;
        int max = 0;
        int[] arrayTask6 = new int[5];
        for (int i = 0; i < arrayTask6.length; i++) {
            arrayTask6[i] = i;
            if (arrayTask6[i] < min) {
                min = arrayTask6[i];
            } else {
                max = arrayTask6[i];
            }

        }

        System.out.print("Минимум = " + min + "\n" + "Максимум = " + max);

    }
}










