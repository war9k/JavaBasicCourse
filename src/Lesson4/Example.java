package Lesson4;

public class Example {
    public static void main(String[] args) {
//        int result = Calculator.sum(2, 3);
//        Calculator.printMessage("sum", result);
//
//        int result1 = Calculator.multiplication(2,3);
//        Calculator.printMessage("multiplication", result1);

        //Calculator.printMessage("sum", Calculator.sum(2,3));

//        Calculator calculator1 = new Calculator();
//        System.out.println(calculator1.sum(2,5));
//
//        Calculator calculator2 = new Calculator("Mary");
//        System.out.println(calculator2.diff(5,2));

        Tester tester1 = new Tester();
        tester1.setId(1);
        tester1.setSalary(1000);
        System.out.println("id: " + tester1.getId() + "salary: " + tester1.getSalary());

        Tester tester2 = new Tester(25, "David");
        tester2.setAge(10);
        tester2.setSalary(2000);
        System.out.println(tester2.getId() + " " +tester2.getName() + " " +tester2.getAge() + " " +tester2.getSalary());

        Tester tester3 = new Tester(26, "Петя", 26, 500);
        System.out.println(tester3.getId() + " " +tester3.getName() + " " +tester3.getAge() + " " +tester3.getCleanSalary());


    }
}