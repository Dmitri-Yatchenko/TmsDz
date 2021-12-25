package com.tms.lesson15.entity;

import java.util.Date;
import java.util.Objects;


public class Human {

    private int id;
    private String name;
    private boolean sex;
    private Date dateOfBirth;

    public Human(int id, String name, boolean sex, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human humans = (Human) o;
        return id == humans.id && sex == humans.sex && Objects.equals(name, humans.name) && Objects.equals(dateOfBirth, humans.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, dateOfBirth);
    }

    @Override
    public String toString() {
        return "humans{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
