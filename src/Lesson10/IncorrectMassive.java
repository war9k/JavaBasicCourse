package Lesson10;

public class IncorrectMassive {
    public static void main(String[] args) {
        int[] mas = new int[5];
        try {
            System.out.println(mas[6]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            System.out.println("nb" + ex.toString());
        } finally {
            System.out.println("works all the time");
        }
    }
}
