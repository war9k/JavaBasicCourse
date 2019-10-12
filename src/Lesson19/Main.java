package Lesson19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StudentsList list = StudentsList.getInstance();
        list.addName("Petia");

        System.out.println(list);
    }
}
