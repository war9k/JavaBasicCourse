package Lesson9;

import java.util.HashSet;
import java.util.Iterator;

public class CountriesHashSet {
    public static void main(String[] args) {

        //Создать список стран мира, используя HashSet
        HashSet<String> hashSet = new HashSet<>();

        //Добавить к этому списку 3 страны, вывести результат используя iterator и toString
        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("ccc");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        //Удалить 2 страны, вывести результат используя iterator и toString
        hashSet.remove(0);
        hashSet.remove("bb");
        iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Проверить, содержится ли элемент в коллекции
        boolean isXxxPresent = hashSet.contains("xxx");
        System.out.println(isXxxPresent);

    }
}
