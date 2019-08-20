package Lesson1;

public class Lesson_2 {
    public static void main(String[] args) {
//Используя while вывести все числа от 0 до 25 в одну строку через пробел

        int a = 0;
        while (a < 25) {
            System.out.print(a + " ");
            a++;
        }
//Используя for вывести каждое четное число от 2 до 20 включительно

        for (int i = 0; i <= 20; i++) //i = i+2
            if (i % 2 == 0)

                System.out.println(i);
//Используя for вывести каждое четное число от 2 до 20 включительно и больше 10
        for (int i = 0; i <= 20; i++)//i = i+2
            if (i % 2 == 0 && i >= 20)

                System.out.println(i);
    }
}
