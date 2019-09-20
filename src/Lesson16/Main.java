package Lesson16;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Спор начат...");
        Egg egg = new Egg();
        Chicken chicken = new Chicken();
        egg.start();
        chicken.start();
        egg.join();
        chicken.join();
        System.out.println("Спор окончен...");
    }
}
