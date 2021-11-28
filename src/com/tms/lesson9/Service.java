package com.tms.lesson9;

import java.util.List;

public interface Service {

    public List<User> searchByName(List<User> list, String name);

    public List<User> searchByGender(List<User> list, Gender gender);

    public List<User> sortAscending(List<User> list);

}
