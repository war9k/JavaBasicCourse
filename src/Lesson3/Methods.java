package Lesson3;

public class Methods {
    public static void main(String[] args) {
        printSum(2, 5);
        printSum(10, 12);
        printSum(3, -8);

        printMultiply(1, 3, 4);
        printMultiply(2, 2, 2);

        int result = getSum(2, 3);
        System.out.println(result);//System.out.println(getSum(2, 3));

        int result2 = getMultiply(7, 9, 12);
        System.out.println(result2);

        int[] mas = {1, 4, -8, 12};
        printInvertArray(mas);
        printArrayX2(mas);

        System.out.println(getSumOfArray(mas));


        int [] mas3 = returnNewArray(mas);
        printMas(mas3);

    }
    //Написать метод, который принимает два числа a и b, выводит на экран результат их сложения
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    //Написать метод, который принимает три числа a, b, c. Выводит на экран их произведение.
    public static void printMultiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    //Написать описанные выше методы таким образом, чтобы они возвращали результат, а не выводили его
    public static int getSum(int a, int b) {
        return a + b;
    }


    public static int getMultiply(int a, int b, int c) {
        return a * b * c;
    }

    //Написать метод, которые выводит любой переданный массив в обратном порядке
    public static void printInvertArray(int[] anyMas) {
        for (int i = anyMas.length - 1; i >= 0; i--) {
            System.out.println(anyMas[i]);
        }
    }

    //Написать метод, который выводит любой переданный массив, умноженный на 2
    public static void printArrayX2(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] * 2);
        }
    }

    //Написать метод, который получает массив, а возвращает сумму его элементов.
    public static int getSumOfArray(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        return sum;
    }

    //Написать метод, который получает массив, а возвращает новый массив, заменив каждый второй элемент на 0
    public static int[] returnNewArray(int[] mas) {
        int[] resultMas = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                resultMas[i] = 0;
            } else {
                resultMas[i] = mas[i];
            }
        }
        return resultMas;
    }

    public static void printMas(int[] anyMas) {
        for (int i = 0; i < anyMas.length; i++) {
            System.out.println(anyMas[i]);
        }
    }
}
