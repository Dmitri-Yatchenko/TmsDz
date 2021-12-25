package com.tms.lesson15.entity;

import java.util.Date;
import java.util.Objects;


public class human {

    private int id;
    private String name;
    private int sex;
    private Date dateOfBirth;

    public human(int id, String name, int sex, Date dateOfBirth) {
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
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
        human humans = (human) o;
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
