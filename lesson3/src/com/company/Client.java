package com.company;

import java.util.Objects;

public class Client {
    private String name;

    private String surname;


    private int age;
    private String iin;
    //Конструктор по умолчанию создается в JVM, но если вы создаете конструктор с параметрами
    //то нужно создавать конструктор по умолчанию в ручную
    public Client() {

    }
    public Client(String name, String surname, int age, String iin) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iin = iin;
    }

    public void showInfo(){

        System.out.println(
                this.age + this.name);
    }

    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getIin() {

        return iin;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setIin(String iin) {

        this.iin = iin;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(iin, client.iin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, iin);
    }
}
