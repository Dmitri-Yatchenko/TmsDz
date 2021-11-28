package com.tms.lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Вася", 30, Gender.MALE);
        User user2 = new User("Витя", 30, Gender.MALE);
        User user3 = new User("Коля", 35, Gender.MALE);
        User user4 = new User("Юля", 28, Gender.FEMALE);

        List<User> userList1 = new ArrayList<>();
        userList1.add(user1);
        userList1.add(user2);
        userList1.add(user3);
        userList1.add(user4);

        List<User> userList2 = new LinkedList<>();
        userList2.add(user1);
        userList2.add(user2);
        userList2.add(user3);
        userList2.add(user4);

        Set<User> userSet1 = new HashSet<>();
        userSet1.add(user1);
        userSet1.add(user2);
        userSet1.add(user3);
        userSet1.add(user4);

        Set<User> userSet2 = new TreeSet<>();
        userSet2.add(user1);
        userSet2.add(user2);
        userSet2.add(user3);
        userSet2.add(user4);

        Service service = new UserService();

        List<User> usersN1 = service.searchByName(userList1, "Юля");
        System.out.println(usersN1.toString());
        List<User> usersG1 = service.searchByGender(userList1, Gender.MALE);
        System.out.println(usersG1.toString());

        List<User> usersN2 = service.searchByName(userList2, "Юля");
        System.out.println(usersN2.toString());
        List<User> usersG2 = service.searchByGender(userList2, Gender.MALE);
        System.out.println(usersG2.toString());

        System.out.println(service.sortAscending(userList2).toString());

//        List<User> usersN3 = service.SearchByName(userSet1, "Юля");
//        System.out.println(usersN3.toString());
//        List<User> usersG3 = service.SearchByGender(userSet1, Gender.MALE);
//        System.out.println(usersG3.toString());
//
//        List<User> usersN4 = service.SearchByName(userSet2, "Юля");
//        System.out.println(usersN4.toString());
//        List<User> usersG4 = service.SearchByGender(userSet2, Gender.MALE);
//        System.out.println(usersG4.toString());

        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(7);
        list.add(10);

        ServiceNumber serviceNumber = new RepetitionSearchService();
        serviceNumber.findRepetitions(list);

    }
}
