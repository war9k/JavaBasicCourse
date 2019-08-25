package Lesson5;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Square.getSquare(5));
//        System.out.println(Square.PI);
//
//        Square square = new Square();
//        System.out.println(square.getPerimeter(5));

        Book book = new Book();
        System.out.println(book.name);
        System.out.println(book.author);
        System.out.println(book.pages);
        System.out.println(book.price);

        book.printAll();
        book.printAll1();
        book.printAll2();
        book.printAll3();
    }
}

