package Homework5;

public class Main {
    public static void main(String[] args) {
        //Tester tester1 = new Tester("Bil");    //  не достуен в другом классе,модификатор доступа pivate
        Tester tester2 = new Tester("Alex", "Gera");
        Tester tester3 = new Tester("Mik", "Djoy", 5);
        Tester tester4 = new Tester("Din", "Loi", 6, "B");
        tester2.setName("Alex");
        tester2.setSurname("Gera");
        tester2.setExperienceInYears(5);
        tester2.setEnglishLevel("A");
        tester2.setSalary(2000);
        System.out.println("Name: " + tester2.getName() + "\n" + "Surname: " + tester2.getSurname() + "\n" + "ExperienceInYears: " + tester2.getExperienceInYears());
        System.out.println("EnglishLevel: " + tester2.getEnglishLevel() + "\n" + "Salary: " + tester2.getSalary());
        // tester.getAnySalary(2000);   нельзя вызвать из другого класса,т.к. модификатор доступа private
        System.out.println(tester2.getExperienceInMonth(5));
        tester2.printNameSurname();
        tester2.printInfo();
    }
}
