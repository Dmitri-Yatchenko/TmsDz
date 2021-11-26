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

        Map<String, Integer> map = new HashMap<>();
        map.put("1", 4);
        map.put("2", 7);
        map.put("3", 4);
        map.put("4", 7);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 1);
        map.put("9", 7);
        map.put("10", 10);

    }
}
