package com.tms.lesson10;

import java.util.Arrays;
import java.util.List;

public class MainFamily {

    public static void main(String[] args) {
        Family family1 = new Family("family1", Arrays.asList(
                new Child("child1", 10, Gender.MALE),
                new Child("child2", 15, Gender.MALE),
                new Child("child3", 20, Gender.FEMALE)
        ));

        Family family2 = new Family("family2", Arrays.asList(
                new Child("child4", 5, Gender.MALE),
                new Child("child5", 15, Gender.FEMALE),
                new Child("child3", 20, Gender.MALE)
        ));

        Family family3 = new Family("family3", Arrays.asList(
                new Child("child7", 2, Gender.MALE),
                new Child("child8", 10, Gender.FEMALE),
                new Child("child9", 15, Gender.MALE),
                new Child("child10", 20, Gender.MALE),
                new Child("child11", 20, Gender.FEMALE)
        ));

        List<Family> families = Arrays.asList(family1, family2, family3);


        //Все дети в имени которых есть 2
        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child1 -> child1.getName().contains("2"))
                .forEach(System.out::println);
        System.out.println("---------------------------------------");


        //Все семьи где больше 3 дктей
        families.stream()
                .filter(family -> family.getChildren().size() > 3)
                .forEach(System.out::println);
        System.out.println("---------------------------------------");


        //Вывести всех мальчиков
        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child1 -> child1.getGender() == Gender.MALE)
                .forEach(System.out::println);
        System.out.println("---------------------------------------");


        //Вывести всех девочек
        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child1 -> child1.getGender() == Gender.FEMALE)
                .forEach(System.out::println);
        System.out.println("---------------------------------------");


        //Вывести имена датей большими буквами
        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .forEach(x -> System.out.println(x.getName().toUpperCase()));
        System.out.println("---------------------------------------");


        //Вывести количество всех детей
        int allChildren = (int) families.stream()
                .flatMap(family -> family.getChildren().stream())
                .count();
        System.out.println(allChildren);
        System.out.println("---------------------------------------");

    }
}
