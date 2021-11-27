package com.tms.lesson9;

import java.util.Comparator;

public class UserComparatorAge implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}
