package Lesson6;

public class Animal {

    public void printAnimals(String... animals) {
//        for (int i = 0; i < animals.length; i++) {
//            System.out.println(animals[i]);
//        }

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
