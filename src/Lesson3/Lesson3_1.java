package Lesson3;

import java.util.Scanner;

public class Lesson3_1 {
    public static void main(String[] args) {
        //Создать пустой массив типа int с названием mas_1 размера n=7;
        int n = 7;
        System.out.println("xx");

        //Создать пустой массив типа float с названием mas_float такого размера, который пользователь вводит с клавиатуры (лучше >10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();
        float[] mas_float = new float[size];

        //Заполнить mas1 числами от 1 до 7; Вывести его


        //Заполнить mas_float рандомными числами, используя Math.Random(); Вывести его
        int[] mas_1 = new int[n];
        for (int i = 0; i < mas_float.length; i++) {
            mas_float[i] = (float) Math.random();
            System.out.println(mas_float[i]);

            //Каждый элемент mas_1 умножить на 3. Вывести результат
            for (i = 0; i < mas_1.length; i++) {
                mas_1[i] = mas_1[i] * 3;
                System.out.println(mas_1[i]);
            }
            //Каждый элемент mas_float возвести в квадрат. Вывести результат
            int powerTwo = 2;
            for (i = 0; i < mas_float.length; i++) {
                mas_float[i] = (float) Math.pow(mas_float[i], powerTwo);
            }
            System.out.println(mas_float[i]);

            //Вывести элементы mas_1 через один
            int step = 2;
            for (i = 0; i < mas_1.length; i = i + step) {
                System.out.println(mas_1[i]);
            }
        }
    }
}
