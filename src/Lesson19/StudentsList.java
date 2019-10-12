package Lesson19;

import java.util.ArrayList;

public class StudentsList {
    private static StudentsList instance;
    private static ArrayList<String> students;
    private static StudentsList studentsList = new StudentsList();
    public static String name;

    private StudentsList() {


    }

    public static StudentsList getInstance() {
        if (students == null) {
            students = new ArrayList<String>();

        }
        return studentsList;
    }

    public static void addName(String name) {
        students.add(name);

    }
}
