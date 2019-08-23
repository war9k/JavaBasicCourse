package Homework3;

public class Task3_1 {
    public static void main(String[] args) {
        //Возвращаем минимальное число
        //вариант с приведением к инту
        int a = (int) (Math.random() * (100 - 1)+ 1);
        int b = (int) (Math.random() * (100 - 1)+ 1);
        int c = (int) (Math.random() * (100 - 1)+ 1);
        int result1 = returnMin(a, b);
        System.out.println(result1);

        //вариант без преведения, для любителей небольших значений
//        double a = (Math.random());
//        double b = (Math.random());
//        double result1 = returnMin(a, b);
//        System.out.println(result1);

        //Проверить четное число или нечетное, вернуть boolean результат
        isReturnEvenOddNumber(a);

        //Возвести число в квадрта, вернуть результат возведения
        System.out.println(returnSquare(b));

        //Возвести число в куб, вернуть результат возведения
        System.out.println(returnCube(c));

        //Метод принимает числа a, b, c возвращает a - b - c
        System.out.println(returnSubstraction(a, b, c));
    }

    //Найти минимальное число из 2 чисел, вернуть минимальное
    public static int returnMin(int a, int b) {
        if (a > b)
            return b;
        else
            return a;
    }

    //Проверить четное число или нечетное, вернуть boolean результат
    public static boolean isReturnEvenOddNumber(int a) {
        return (a % 2 == 0);
    }

    //Возвести число в квадрта, вернуть результат возведения
    public static int returnSquare(int a) {
        return a * a;
    }

    //Возвести число в куб, вернуть результат возведения
    public static int returnCube(int a) {
        return a * a * a;
    }

    //Метод принимает числа a, b, c возвращает a - b - c
    public static int returnSubstraction(int a, int b, int c) {
        return a - b - c;
    }
}
