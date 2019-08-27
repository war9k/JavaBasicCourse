package Lesson6_1;

import Lesson6.Computer;

public class Mac extends Computer {

    private double price;

    public Mac(String model) {
        super(model);
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void printPrice() {
        System.out.println(this.price * 2);
    }

    @Override
    public void printModel() {
        System.out.println("I am method from Mac");
    }
}
