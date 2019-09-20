package Lesson13;

import java.util.Scanner;

public class Line {
    public int lineLenght(String line) {
        return line.split(" ").length;
    }

    public String replaceLine(String line) {
        return line.trim().replace("a", "%");
    }

    public boolean isEmpty(String line) {
        return line.isEmpty();
    }
}
