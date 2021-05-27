package com.company;

public class Person {
    private String name;
    private String surname;
    private int dataOfBirth;
    private int age;

    public Person ( String name , String surname , int dataOfBirth, int age ) {
        setName ( name );
        setSurname ( surname );
        setDataOfBirth ( dataOfBirth );
        setAge( age );
    }

    public Person () {

    }

    public Person ( String name, int age ) {
        setName ( name );
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname ( String surname ) {
        this.surname = surname;
    }

    public int getDataOfBirth () {
        return dataOfBirth;
    }

    public void setDataOfBirth ( int dataOfBirth ) {
        if (dataOfBirth >= 1950 && dataOfBirth <= 2020) {
            this.dataOfBirth = dataOfBirth;
        } else {
            System.out.println("Invalid data of birth!");
        }
    }
}
