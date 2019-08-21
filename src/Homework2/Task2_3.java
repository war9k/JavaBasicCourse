package Homework2;

import java.util.Scanner;

class Task2_3 {
    public static void main(String[] args) {
        // Объявляем Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        // Читаем с клавиатуры размер массива и записываем в size
        int size = input.nextInt();
        // Создаём массив int размером в size
        int mas[] = new int[size];
        System.out.println("Введиете элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        // Заполняем массив элементами, введёнными с клавиатуры
        for (int i = 0; i < size; i++) {
            mas[i] = input.nextInt();
        }
        System.out.print("Введеные элементы массива:");
        for (int i = 0; i < size; i++) {
            // Выводим на экран, полученный массив
            System.out.print(" " + mas[i]);
        }
        System.out.println('\n');

        //каждый 3-й элемент массива умножить на 2 (1 способ)
        System.out.println("Умножение каждого третьего элемента на 2:");
        for (int i = 0; i < mas.length; i += 3) {
            System.out.print(mas[i] * 2);
        }

        /*//2 способ (проверяем, что индекс элемента масива делится на 3 без остатка)
        for (int i = 0; i < mas.length; i++)
        {
            if (i % 3 == 0)
            {
                mas[i] *= 2;
            }
            System.out.println(mas[i]);*/
    }
}