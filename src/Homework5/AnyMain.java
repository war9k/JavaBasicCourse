package Homework5;

public class AnyMain {
    public static void main(String[] args) {
        Tester tester = new Tester("Alex");   // не доступен в другом пакете,модификатор доступа private
        Tester tester1 = new Tester("Bob", "Gera");    // не доступен в другом пакете,будет доступен,если наследовать
        Tester tester2 = new Tester("Mik", "Djoy", 5);  // не доступен в другом пакете модификатор friendly
        Tester tester3 = new Tester("Din", "Loi", 6, "B");
        tester.setName("Alex");  //   не доступен в другом пакете модификатор friendly
        tester.setSurname("Gera");  //    не доступен в другом пакете модификатор friendly
        tester.setExperienceInYears(5);  //  не доступен в другом пакете модификатор friendly
        tester.setEnglishLevel("A");   //   не доступен в другом пакете модификатор friendly
        tester.setSalary(2000);  //  не доступен в другом пакете модификатор friendly
        System.out.println("Name: " + tester.getName() + "\n" + "Surname: " + tester.getSurname() + "\n" + "ExperienceInYears: " + tester.getExperienceInYears());
        System.out.println("EnglishLevel: " + tester.getEnglishLevel() + "\n" + "Salary: " + tester.getSalary());
         tester.getAnySalary(2000);  // не доступен в другом пакете, модификатор доступа private
        System.out.println(tester.getExperienceInMonth(5));  //    не доступен в другом пакете модификатор friendly
        tester.printNameSurname();  // не доступен в другом пакете,будет доступен,если наследовать
        tester3.printInfo();
    }
}
