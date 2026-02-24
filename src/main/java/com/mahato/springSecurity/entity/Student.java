package com.mahato.springSecurity.entity;

public class Student {
    private int id;
    private String name;
    private int cgpa;
    public Student(int id, String name, int cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
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

    public int getcgpa() {
        return cgpa;
    }

    public void setcgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
