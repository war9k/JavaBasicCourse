package Homework1;

public class HomeWork1 {
    public static void main(String[] args) {

// Создаём переменные следующих типов и присваиваим им значение, явно отображающее тип переменной

        int a = 20;
        short b = 8;
        long c = 365;
        double d = 33.15;
        float e = (float) 300.14;
        char f = 'a';
        boolean j = true;

//Проводим операции с различными переменными

        int result1 = a + b;
        double result2 = c - d;
        double result3 = e * d;
        boolean result4 = c > d;
        boolean result5 = e < a;
        boolean result6 = c == d;

//Выводим результат в строку

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.print(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5 + " " + result6);

    }
}

