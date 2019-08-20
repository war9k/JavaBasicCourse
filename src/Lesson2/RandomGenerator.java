package Lesson2;

public class RandomGenerator {
    public static void main(String[] args) {
//Сгенерировать 5 случайных чисел. Каждое вывести в консоль
        for (int i = 0; i < 5; i++) {
            double a = Math.random();
            System.out.println(Math.random());
        }
//Сгенерировать 3 случайных числа в диапазоне от 15 до 20 включительно
        for (int i = 0; i < 3; i++) {
            int result = 5 + (int)(Math.random()*(21 - 5));
            System.out.println(result);
        }
    }
}

