package com.tms.lesson5;

public class User {
    private String name;
    private String surname;
    private int age;
    private Genders gender;
    private Address address;

    public User(String name, String surname, int age, Genders gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getNameAndSurname() {
        return name + " " + surname;
    }

    public void increaseAge(){
        age++;
    }

    public String displayInformation(){
        return name + " " + surname + " " + age + " " + gender;
    }

    public void setAddress(String country, String town){
        address = new Address(country,town);
    }

    public Address getAddress() {
        return address;
    }


    class Address{
        public String country;
        public String town;

        Address(String country, String town){
            this.country =country;
            this.town = town;
        }

    }
}
