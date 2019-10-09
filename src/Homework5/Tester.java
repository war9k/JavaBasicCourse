package Homework5;

public class Tester {
    public String name;
    public String surname;
    int experienceInYears;
    protected String englishLevel;
    private int salary;
    String space = " ";

    private Tester(String name) {
        this.name = name;
    }

    protected Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Tester(String name, String surname, int experienceInYears) {
        this(name, surname);
        this.experienceInYears = experienceInYears;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears);
        this.englishLevel = englishLevel;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }

    void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    int getExperienceInYears() {
        return experienceInYears;
    }

    void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    String getEnglishLevel() {
        return englishLevel;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    private int getAnySalary() {
        return salary * 2;
    }

    int getExperienceInMonth(int experienceInYears) {
        return experienceInYears * 12;
    }

    protected void printNameSurname() {
        System.out.println(name + space + surname);
    }

    public void printInfo() {
        System.out.println(name + space + surname + space + experienceInYears + space + englishLevel + space + salary);
    }

    public static void main(String[] args) {
    }
}
