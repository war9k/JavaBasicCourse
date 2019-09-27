package Lesson10;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) throws NegativeAgeException {
        if (age < 0)
        {
            throw new NegativeAgeException();
        }
        this.age = age;
        this.name = name;
    }
    public Person()
    {
        this.age = 0;
        this.name = " ";
    }
}
