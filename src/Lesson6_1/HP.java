package Lesson6_1;

import Lesson6.Computer;

public class HP extends Computer {

    private String os = "Windows Vista";

    public HP(String model) {
        super(model);
    }

    public void printAll() {
        System.out.println(this.os);
        printModel();
    }

    @Override
    public void printModel() {
        System.out.println("I am method from HP");
    }
}
