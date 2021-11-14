package com.tms.lesson5;

public class MainUser {
    public static void main(String[] args) {
        User user = new User("Дмитрий", "Ятченко", 30, Genders.MALE);
        user.setAddress("Беларусь", "Гомель");
        User.Address address = user.getAddress();
        System.out.println(user.displayInformation() + " " + address.country + " " + address.town);
    }
}
