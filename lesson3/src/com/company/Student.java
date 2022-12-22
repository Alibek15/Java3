package com.company;

public class Student {
    private Integer id;
    private String  name;
    private String surname;
    private Double gpa;

    public Student(){

    }
    public Student(Integer id, String name, String surname, Double gpa){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.gpa=gpa;
    }
    public String getStudentData(){
        return "Student {" + "id=" + id + ", name= " + name + ",\n" + " surname= " + surname + ",\n" + " gpa= "+gpa+'}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getGpa() {
        return gpa;
    }
}
