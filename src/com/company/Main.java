package com.company;

import java.sql.SQLOutput;
import java.util.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Friend[] friends = new Friend[3];
        friends[0] = new Friend("Amir", "Khamidullin", 1, 30);
        friends[1] = new Friend("Bob", "Khamidullin", 2, 1);
        friends[2] = new Friend("Petya", "Antipov", 3, 15);

        Arrays.sort(friends);

        for (int i = 0; i < friends.length; i++)
            System.out.println(friends[i]);

    }
}

class Friend implements Comparable<Friend> {
    public String firstname;
    public String lastname;
    public int phone;
    public int birth;

    public Friend(String firstname, String lastname, int phone, int birth){
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
    public int compareTo(Friend o) {
        if(lastname.equals(o.lastname) == false) {
            return  this.lastname.compareTo(o.lastname);
        } else {
            return this.firstname.compareTo(o.firstname);
        }

    }
}























