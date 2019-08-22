package Lesson4;

public class Calculator {

    public Calculator()
    {
        System.out.println("Конструктор по умолчанию");
    }

    public Calculator(String name)
    {
        System.out.println(name);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public void printMessage(String operation, int result) {
        String message = String.format("The result of the operation %s is %s", operation, result);
        System.out.println(message);
    }
}

