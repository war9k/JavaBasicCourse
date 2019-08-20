package Homework2;

import java.util.Scanner;

class Task2_1
{
    public static void main(String[] args)
    {
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
        for (int i = 0; i < size; i++)
        {
            mas[i] = input.nextInt();
        }
        System.out.print("Введеные элементы массива:");
        for (int i = 0; i < size; i++)
        {
            // Выводим на экран, полученный массив
            System.out.print(" " + mas[i]);
        }
        System.out.println('\n');

        //пройти по массиву, вывести все элементы в обратном порядке
        System.out.println("В обратном порядке:");
        for (int i = mas.length - 1; i >= 0; i--)
        {
            System.out.print(mas[i]);
        }
        System.out.println('\n');

        //найти произведения всех элементов массива, вывести
        System.out.println("Произведение всех элементов:");
        int result = 1;
        for (int i = 0; i < mas.length; i++)
        {
            result = result * mas[i];
        }
        System.out.print(result);

        System.out.println('\n');

        //каждый 3-й элемент массива умножить на 2 (1 способ)
        System.out.println("Умножение каждого третьего элемента на 3:");
        for (int i = 0; i < mas.length; i += 3)
        {
            System.out.print(mas[i] * 3);
        }
        /*//2 способ (проверяем, что индекс элемента масива делится на 3 без остатка)
        for (int i = 0; i < mas.length; i++)
        {
            if (i % 3 == 0)
            {
                mas[i] *= 2;
            }
            System.out.println(mas[i]);*/

        //найти количество нулевых элементов, вывести количество. если нулевых элементов нет - вывести сообщение, что их нет
        int flag = 0;
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] == 0)
            {
                System.out.println(i);
                flag++;
            }
        }
        if (flag != 0)
        {
            System.out.println("нет элементов, равных нулю");
        }

        //пройти по массиву и поменять местами каждые 2 соседних элемента
        //Переменная, которая будет использоваться при обмене элементов
        String temp;
        for (int i = 0; i < n / 2; i++)
        {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
        }
    }





