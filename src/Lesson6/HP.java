package Lesson6;

public class HP extends Computer {

    private String os = "Windows Vista";

    public HP(String model) {
        super(model);
    }

    public void printAll() {
        System.out.println(this.os);
        printModel();
    }

}
