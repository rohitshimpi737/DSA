package com.Rohit.Comparator;

import java.util.*;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name , int age) {
        this.name = name;
        this.age=age;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Rohit",19));
        people.add(new Person("Girish",22));
        people.add(new Person("Manas",35));
        people.add(new Person("Om",11));

        // 1. Sorting by Property
        Collections.sort(people,Comparator.comparingInt(Person::getAge));
        for(Person person:people){
            System.out.println(person.getName() + " : "+ person.getAge());
        }

        System.out.println();
        people.sort(Comparator.comparing(Person::getName));
        for(Person person:people){
            System.out.println(person.getName() + " : "+ person.getAge());
        }
        System.out.println();
        // 4. Reverse Ordering
        Collections.sort(people, Collections.reverseOrder(Comparator.comparingInt(Person::getAge)));
        for(Person person:people){
            System.out.println(person.getName() + " : "+ person.getAge());
        }

        Map<String, Integer> map = new TreeMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("cherry", 5);
        map.put("date", 1);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        // Sort the list based on the values using a custom comparator
        Collections.sort(entries, Comparator.comparingInt(Map.Entry::getValue));
        System.out.println("TreeMap Sorting: " +entries );

        List<String> sortedKeysList = new ArrayList<>(map.keySet());
        sortedKeysList.sort(Comparator.comparingInt(map::get));
        System.out.println(sortedKeysList);

    }

}
