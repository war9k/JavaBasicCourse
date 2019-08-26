package Homework4;


public class Call
{
    public static void main(String[] args)
    {
        Person person = new Person("Vasya", "Petrov", 20, 375296666);
        person.printAllInformation();
        person.setName("Jeny");
        person.setSurname("Ivanov");
        person.printName();
        person.setAge(20);
        person.isAdult();
    }
}
