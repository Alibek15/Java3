package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //object прородитель всех обьектов
        //все обьекты неявно наследуются от обджект
        //обьекты в джаве можно копировать, только если реализовывают интерфейс cloneable
        //finalize() данный метод нужен для того чтобы в этом методе прописывать служебные вещи до того как обьект будет удален
        //HashCode() возвращается хэшкод обьекта ошибка с коллизией
        //*******Human human = new Human();
        //*****human.address="asd";
        //или через конструктор или через геттеры и сеттеры
        /*System.out.println(Human.NAME);
        //примитивы создаются в стеке
        //примитив созданный в рамках класса создается в рамках heapa кучи
        //примитивы от маленького к большому // byte short int  float long double char boolean
        Client client = new Client("Jack","Born",25,"5341564");
        System.out.println(client);

        //List без указания дженерика имеет Raw тип - сырой тип
        List<String> list = new ArrayList<>();
        list.add(12);
        list.add("jack");
        list.add(true);

        for(Object object:list){
            object+=1;
        }*/

        /*Student[] students={
                new Student(1,"test","test",3.2),
                new Student(2,"test2","test2",3.1),
                new Student(3,"test3","test3",3.3),
                new Student(4,"test4","test4",3.5),
                new Student(5,"test5","test5",3.6)
        };
        for(Student stud:students){
            System.out.println(stud.getStudentData());
        }*/
        //robert martin clean code
        //apache string model помогает уберечься от хакерских атак, также сайт не связан с бд
        //Как здесь можно видеть есть диспатчер, который совсем не соединен с авторами которые наполняют контент и с бдшкой в том числе.
        // Диспатчер всегда статичный и наполнение идет только от автора через публикацию. Клиенты могут зайти и только с диспатчера забрать информацию.
        // Если изменения вносятся в сайт, то только и только тогда после публикации они появятся на сайте. И так получается, что клиент
        // ни каким образом не имеет доступа во внутренюю сеть
        //28:23

       Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        System.out.println("""
                PRESS [1] TO ADD STUDENT
                PRESS [2] TO LIST STUDENT
                PRESS [0] TO EXIT""");
        while(true){
            System.out.println("Enter command: ");
            var num = scanner.nextInt();
            if(num == 1){
                System.out.println("Insert name: ");
                String name = scanner.next();

                System.out.println("Insert surname");
                String surname = scanner.next();

                System.out.println("Insert GPA: ");
                double gpa = scanner.nextDouble();
                students.add(new Student(students.size()+1,name,surname,gpa ));

            }
            else if(num == 2){
                for(Student st:students){
                    System.out.println(st.getStudentData());
                }
            }
            else{
                break;
            }
        }
       /* Client2 client2 = new Client2("Jack","Born",25);
        Client2 client = new Client2("Jack2","Born2",45);
        System.out.println(client2);
        System.out.println(client);*/


        //client2->human2->client2

//53-12





    }
}
