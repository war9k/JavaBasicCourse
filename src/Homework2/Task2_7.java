package Homework2;

import java.util.Scanner;

class Task2_7 {
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
        
        //найти минимальный-максимальный элементы и вывести
        int min = mas[0];
        int max = mas[1];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        System.out.println("Минимальный и максимальный элементы:");
        System.out.println(min + " " + max);
    }
}