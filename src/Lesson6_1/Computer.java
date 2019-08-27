package Lesson6_1;

public abstract class Computer {
    private String model;


    public Computer(String model) {
        this.model = model;
    }

    public abstract void printModel();
}
