package Lesson2;

import java.util.Scanner;

public class ScannerExample {
//Ввести с консоли любое число. Если оно четное – вывести снова в консоль

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a);
        }
    }
}


