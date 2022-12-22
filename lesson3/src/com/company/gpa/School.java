package com.company.gpa;

public class School {
    private Integer grade;
    private String studentName;
    private Integer quantityOfStudents;
    private Character letter;
    private Float averageGpa;
    private Integer Gpa;
    private String language;
    private String city;

    public School(Integer grade, String studentName, Integer quantityOfStudents, Character letter, Float averageGpa, Integer gpa, String language, String city) {
        this.grade = grade;
        this.studentName = studentName;
        this.quantityOfStudents = quantityOfStudents;
        this.letter = letter;
        this.averageGpa = averageGpa;
        Gpa = gpa;
        this.language = language;
        this.city = city;
    }
    public School(){

    }

    public Integer getGrade() {
        return grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public Character getLetter() {
        return letter;
    }

    public Float getAverageGpa() {
        return averageGpa;
    }

    public Integer getGpa() {
        return Gpa;
    }

    public String getLanguage() {
        return language;
    }

    public String getCity() {
        return city;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setQuantityOfStudents(Integer quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public void setAverageGpa(Float averageGpa) {
        this.averageGpa = averageGpa;
    }

    public void setGpa(Integer gpa) {
        Gpa = gpa;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
