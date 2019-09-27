package Lesson14;

import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {

        Converter converter = new Converter();
        Function<String[], Double> function = (String... params) ->
        {
            String amount = params[0];
            String coefficient = params[1];
            return Integer.parseInt(amount.substring(0, amount.indexOf(' '))) * Double.parseDouble(coefficient);
        };

        converter.convert(function, "20 BLR", "2.1");
    }
}
