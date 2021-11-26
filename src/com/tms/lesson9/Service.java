package com.tms.lesson9;

import java.util.List;

public interface Service {

    public User SearchByName(List<User> list, String name);

    public List<User> SearchByGender(List<User> list, Gender gender);

    public List<User> SortAscending(List<User> list);

}
