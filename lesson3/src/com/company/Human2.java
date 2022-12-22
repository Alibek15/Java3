package com.company;

public class Human2 {

    //Классы обертки
    //byte - Byte,short - Short, int - Integer, long - Long, float - Float
    //double - Double, char - Character, boolean - Boolean
    // Инициализация по умолчанию
    // byte  - 0
    // short - 0
    // int - 0
    //long - 0
    // float - 0.0
    // double - 0.0
    // char /0000
    //boolean - false
    // только на уровне классов инициализация
    // все классы обертки - null

    private Integer age;

    public Human2(int age) {
        System.out.println("Конструктор human");
        this.age = age;
    }
    //использовать обертки вместо примитивов


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
