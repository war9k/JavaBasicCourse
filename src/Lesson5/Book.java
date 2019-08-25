package Lesson5;

public class Book {
    private String name = "Shantaram";
    String author = "Roberts";
    protected int pages = 300;
    public double price = 255.5;



    public void printAll() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(pages);
        System.out.println(price);
    }

    private void printAll1() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(pages);
        System.out.println(price);
    }

    protected void printAll2() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(pages);
        System.out.println(price);
    }

    void printAll3() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(pages);
        System.out.println(price);
    }




    public void demonstrate() {
        this.printAll();
        this.printAll1();
        this.printAll2();
        this.printAll3();

    }
}
