package Lesson14;

public class Main {
    public static void main(String[] args) {

        ICalculator calculator = (x) -> x[0] + x[1];
        System.out.println(calculator.sum(1, 4));

        calculator = (x) -> x[0] + x[1] + x[2];
        System.out.println(calculator.sum(1, 4, 9));

        calculator = (x) -> x[0] + x[1] + x[2] + x[3];
        System.out.println(calculator.sum(1, 4, 9, 10));
    }
}
