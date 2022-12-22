package com.company;

public class Human {
    //private - доступен только в рамках класса
    private String name;

    String surname; //defaut private package-доступен в рамках пакета
    //protected - Виден в ромках пакета и в классах наследниках
    protected String address;
    //public - доступен везде
    public String city;
    //final к переменной делает ее константой
    static  final  String NAME = "Alex";
    //final к методу не дает возможности переопределять метод
    //final к классу нельзя наследоваться

    public String getName(String name){

        return NAME;
    }
    //static - нельзя изменить
    //ООП парадигма полиморфизм наследовангие инкапсуляция
    //инкапсуляция - сокрытие обьектов из вне
    //полиморфизм - способность обьекта принимать разные формы, обьекты с одинаковой спецификацией имеют различную реализацию
    //полиморфизм на примере конь -> пегас
    // насследование - новый класс на основе существующего, только от одного класса
    //абстракция - интерфейсы , и некоторые классы


}
