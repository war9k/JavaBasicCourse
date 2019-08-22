package Lesson4;

public class Tester {
    public int id;
    public String name;
    public int age;
    public double salary;

    public Tester() {
        this.id = 0;
        this.name = null;
        this.age = 0;
        this.salary = 0;
    }

    public Tester(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tester(int id, String nam, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getCleanSalary() {
        return this.salary * 0.8;
    }
}
