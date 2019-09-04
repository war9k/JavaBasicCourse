package Lesson9;

import java.util.HashMap;

public class CountriesHashMap {
    public static void main(String[] args) {
        //Создать список стран мира с номерами, используя HashMap
        HashMap<Integer, String> map = new HashMap();

        map.put(1, "aa");
        map.put(2, "bb");
        map.put(3, "cc");

        //Удалить 2 страны
        map.remove(1);
        map.remove(2, "bb");
        System.out.println(map);

        //Вывести страну по ключу
        System.out.println(map.get(3));

        //Вывести список всех ключей
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        //Вывести список всех стран
        map.values().stream().forEach(element -> System.out.println(element));

        //Проверить, содержится ли элемент в коллекции
        boolean result = map.containsValue("dddd");
        System.out.println(result);


    }
}
