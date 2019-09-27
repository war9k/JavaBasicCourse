package Lesson10;

public class Main {
    public static void main(String[] args) {

        Person person;
        try {
            person = new Person(-20, "1111");
        } catch (NegativeAgeException ex) {
            System.out.println(ex.toString());
        }
        finally {
            //person = new Person(0);
        }
    }
}
