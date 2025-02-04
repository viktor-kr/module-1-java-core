public class HomeWorkApp2 {
    public static void main(String[] args) {

        twoIntegers(9, 1);
        checkNumber(-1);
        numberSign(1);
        setString("is not a bug", 5);
        checkYear(1988);
    }

    public static boolean twoIntegers(int first, int second) {

        return first + second > 10 && first + second <= 20;

    }
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean numberSign(int number) {

        return number < 0;
    }

    public static void setString(String myString, int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(myString);
        }
    }

    public static boolean checkYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

}