package Lesson18;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Tester tester = new Tester();
//        Class c = tester.getClass();
//        Field[] fields = c.getFields();
//        for (Field field : fields) {
//            System.out.println(field.getName() + " " + field.get(tester));
//        }
//
//        Field[] declaredFields = c.getDeclaredFields();
//        for (Field field : declaredFields) {
//            field.setAccessible(true);
//            System.out.println(field.getName() + " " + field.get(tester));
//        }

        Field f = tester.getClass().getDeclaredField("age");
        f.setAccessible(true);
        f.setInt(tester, 88);
        System.out.println(tester);
    }
}
