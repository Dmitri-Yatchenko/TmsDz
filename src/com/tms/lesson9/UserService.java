package com.tms.lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UserService implements Service {

    @Override
    public List<User> SearchByName(List<User> list, String name) {
        List<User> users = new ArrayList<>();
        for (User user : list) {
            if (user.getName().equals(name)) {
                users.add(user);
            }
        }
        return users;
    }

    @Override
    public List<User> SearchByGender(List<User> list, Gender gender) {
        List<User> users = new ArrayList<>();
        for (User user : list) {
            if (user.getGender().equals(gender)) {
                users.add(user);
            }
        }
        return users;
    }

    @Override
    public List<User> SortAscending(List<User> list) {

        UserComparatorAge userComparatorAge = new UserComparatorAge();
        Collections.sort(list, userComparatorAge);
        return list;
    }

}
