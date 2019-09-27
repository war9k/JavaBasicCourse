package Lesson9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        //Добавить к этому писку 3 страны, вывести результат
        countries.add("USA");
        countries.add("Russia");
        countries.add("Iran");
        countries.add("Greece");


        //Вывести все страны через стримы
        countries.stream().forEach(country -> System.out.println(country));

        //Вывести все страны через for
        for (String country : countries) {
            System.out.println(country);
        }

        //Заменить 2-й элемент
        countries.set(1, "Belarus");

        //Удалить его по индексу
        countries.remove(countries.size() - 1);

        //Удалить любой элемент по значению
        countries.remove("USA");

        //Узнать индекс любого элемента
        int index = countries.indexOf("Iran");
        System.out.println(index);

        //Проверить, содержится ли элемент в коллекции
        boolean isIranPresent = countries.contains("Iran");
        System.out.println(isIranPresent);
    }
}
