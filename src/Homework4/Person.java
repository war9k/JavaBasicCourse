package Homework4;

public class Person
{
    public String name;
    public String surname;
    public int age;
    public long phoneNumber;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void printAllInformation()
    {
        System.out.println(
                "name: " + name + " " + "surname: " + " " + surname + " " + "age: " + " " + age + " " + "phonenumber: "
                        + " " + phoneNumber);
    }

    public void printName()
    {
        System.out.println(
                "name: " + name + " " + "surname: " + " " + surname + " ");
    }

    public void isAdult()
    {
        if (age > 18)
        {
            System.out.println("Older then 18");
        }
        else
        {
            System.out.println("Younger then 18");
        }
    }

    public Person(String name, String surname, int age, long phoneNumber)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}

