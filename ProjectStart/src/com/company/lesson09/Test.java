package com.company.lesson09;
/*Конструкторы, геттеры/сеттеры, ключевое слово this в java
getter - дает возможность на чтение данных
setter - дает возможность на запись/изменение данных
наличие двух методов дает доступ на чтение и запись данных.
обо метода являются основными блоками на которые опирается принцип инкапсуляции,
который подразумевает приватность данных заключенных в наличии модификатора доступа 'private'/
 */
public class Test {
    public static void main(String[] args) {
        User user = new User(30, "Alex", "pas");
        System.out.println(user.getName());
        user.setName("Vasya");
        System.out.println(user.getName());

        User user1 = new User(30, "Janh");
        System.out.println(user1.getName());

        User user2 = new User();
        System.out.println(user2.getName());
        System.out.println(user2.getAge());
    }
}
