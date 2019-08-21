package Lesson3;

import java.util.Scanner;

public class MassTraining {
    public static void main(String[] args) {
        //Создать пустой массив типа int с названием mas размера n=5;
        int n = 5;
        int[] mas = new int[n];
        System.out.println("xx");

        //Создать пустой массив типа double с названием mas_double такого размера, который пользователь вводит с клавиатуры (лучше >10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();
        double[] mas_double = new double[size];

        //Создать пустой массив типа int с названием mas размера n=5;
        for (int i = 0; i < mas.length; i++) {

            mas[i] = i + 1;
        }

        //Заполнить mas_double рандомными числами, используя Math.Random(); Вывести его
        for (int i = 0; i < mas_double.length; i++) {
            mas_double[i] = Math.random();
            System.out.println(mas_double[i]);
        }

        //К каждому элементу mas прибавить 2. Вывести результат
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i] + 2;
            System.out.println(mas[i]);
        }

        //Каждый элемент mas_double возвести в квадрат. Вывести результат
        int powerTwo = 2;
        for (int i = 0; i < mas_double.length; i++) {
            mas_double[i] = Math.pow(mas_double[i], powerTwo);
            System.out.println(mas_double[i]);
        }
        //Вывести через один элементы массива mas
        int step = 2;
        for (int i = 0; i < mas.length; i = i + step) {
            System.out.println(mas[i]);
        }
        //Вывести элементы массива mas_double, номер которых делится без остатка на 3
        for (int i = 0; i < mas_double.length; i++) {
            if (i % 3 == 0) {
                System.out.println(mas_double[i]);
            }
        }
    }
}
