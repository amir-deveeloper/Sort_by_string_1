package com.company;

import java.sql.SQLOutput;
import java.util.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person("Amir", "Khamidullin", 1, 30);
        persons[1] = new Person("Bob", "Khamidullin", 2, 1);
        persons[2] = new Person("Petya", "Antipov", 3, 15);

        Arrays.sort(persons);

        for (int i = 0; i < persons.length; i++)
            System.out.println(persons[i]);

    }
}

class Person implements Comparable<Person> {
    public String firstname;
    public String lastname;
    public int phone;
    public int birth;

    public Person(String firstname, String lastname, int phone, int birth){
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.birth = birth;

    }



    @Override
    public String toString() {
        return lastname + ", " + firstname + ", " + phone + ", " + birth;
    }

    @Override
    public int compareTo(Person o) {
        if(lastname.equals(o.lastname) == false) {
            return  this.lastname.compareTo(o.lastname);
        } else {
            return this.firstname.compareTo(o.firstname);
        }

        //return this.name.compareTo(o.name);
        //return this.age-o.age;
    }
}























