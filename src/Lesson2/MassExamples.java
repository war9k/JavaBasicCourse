package Lesson2;

import java.util.Scanner;

public class MassExamples {
    public static void main(String[] args) {
//Пройти по массиву, вывести все элементы

        int size = 6;
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 0 + (int) (Math.random() * (10 - 0));
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

//Вывести все элементы в обратном порядке
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }

//Найти сумму всех элементов массива, вывести
        int result = 0;
        for (int i = 0; i < mas.length; i++) {
            result = result + mas[i];
        }
        System.out.print(result);

//Каждый элемент умножить на 3
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i] * 3;
            System.out.print(mas[i]);
        }

//Найти и вывести номер нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет
        int flag = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                System.out.println(i);
                flag++;
            }
        }
        if (flag != 0) {
            System.out.println("нет элементов, равных нулю");
        }

//Найти минимальный элемент
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println(min);

//Поменять местами 1-й и последний элементы
        int c = mas[0];
        mas[0] = mas[mas.length - 1];
        mas[mas.length - 1] = c;
    }
}

