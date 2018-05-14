package src;

/**
 * Created by Ezgi on 1.05.2018.
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;
    private int phoneNumber;

    public Person(String name, String surname, int age, String address, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void increaseAge() {
        this.age++;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
