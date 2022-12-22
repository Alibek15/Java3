package com.company;

public class Client2 extends Human2{
    private String name;
    private String surname;


    {
        System.out.println("Динамический констурктор");
    }
    static {
        System.out.println("Статический конструктор");
    }
    //конструкторы нужны  чтобы помещать служебную информацию или выводить операции
    //срабатывают единожды и сразу
    //статические обьекты грузятся на уровне класса не на уровне обьекта принадлежат классам и находятся в PG
    public Client2(String name, String surname, int age) {

        super(age);
        System.out.println("конструктор client ");
        this.name = name;
        this.surname = surname;
        //родительский конструктор всегла первый
    }

    @Override
    public String toString() {
        return "Client2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "age='" + super.getAge()+
                '}';
    }
    //switcher ctr + tab
    //alt+insert getter setter
}
