package Lesson9;

import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {

        //Создать двусвязный список стран мира
        LinkedList<String> states = new LinkedList<String>();
        //Добавить к этому списку 3 страны ( 1 в начало и 2 в конец), вывести результат
        states.addFirst("Belgium");
        states.addLast("France");
        states.addLast("Great Britain");

        System.out.println(states);

        //Заменить 2-й элемент
        states.set(1, "Denmark");
        System.out.println(states);

        //Вывести первый и последний элементы
        System.out.println(states.getFirst() + " " + states.getLast());

        //Удалить первый и последний элементы
        states.removeFirst();
        states.removeLast();
        System.out.println(states);

        //Очистить список полностью
        states.clear();
        System.out.println(states);
    }
}
