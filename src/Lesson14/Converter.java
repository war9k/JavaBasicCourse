package Lesson14;

import java.util.function.Function;

public class Converter {
    public double convert(Function<String[], Double> function, String...value) {
        Double result = function.apply(value);
        System.out.println(result);
        return result;
    }
}
