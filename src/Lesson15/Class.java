package Lesson15;

import java.io.*;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phrase");
        String string = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter("/Users/war/Desktop/Test2")){
        fileWriter.write(string);
        fileWriter.flush();

        FileReader fileReader = new FileReader("/Users/war/Desktop/Test2");
        char [] result = new char[string.length()];
        fileReader.read(result);
        for (int i = result.length -1; i >=0; i--){
            System.out.println(result[i]);
        }

        } catch (IOException e){
            e.printStackTrace();
        }


//        try (FileOutputStream fileOutputStream = new FileOutputStream("/Users/war/Desktop/Test")) {
//            fileOutputStream.write(string.getBytes());
//            FileInputStream fileInputStream = new FileInputStream("/Users/war/Desktop/Test");
//
//            while (fileInputStream.available() > 0) {
//                char symbol = (char) fileInputStream.read();
//                if (symbol == ' ') {
//                    symbol = ' ';
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
