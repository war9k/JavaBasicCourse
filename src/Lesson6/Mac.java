package Lesson6;

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
}
