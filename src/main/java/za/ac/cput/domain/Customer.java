package za.ac.cput.domain;

public class Customer {

private String Name;
private String Surname;
private int Age ;



    public Customer(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                '}';
    }
}
