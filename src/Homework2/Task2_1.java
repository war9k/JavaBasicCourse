package Homework2;

import java.util.Scanner;

class Task2_1 {
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
        System.out.println();
    }
    //пройти по массиву, вывести все элементы в обратном порядке
    //for (int i = mas.length - 1; i >= 0; i--) {
    //  System.out.print(mas[i] + " ");
}




