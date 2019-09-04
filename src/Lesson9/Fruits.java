package Lesson9;

import java.util.ArrayList;
import java.util.Iterator;

public class Fruits {
    public static void main(String[] args) {
        //Создать список фруктов, используя ArrayList, добавить в него 3 элемента
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("aa");
        fruits.add("bb");
        fruits.add("cc");

        //Вывести все объекты списка, используя iterator и цикл while
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}

