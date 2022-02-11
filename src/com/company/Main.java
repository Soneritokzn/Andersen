package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> myThings = new ArrayList<>();
        myThings.add("Something");
        myThings.add("Shiet");
        myThings.add("Someshit");
        myThings.add("Sameshit");
        System.out.println(myThings.get(3));
        System.out.println(myThings.size());

        System.out.println(myThings.subList( 2, 4));

        ArrayList<Cat> cats = new ArrayList<Cat>();

        Cat thomas = new Cat();
        cats.add(0, thomas);
        thomas.Meow();
        Cat vasya = new Cat();
        cats.add(1, vasya);
        vasya.Meow();
        System.out.println(cats.size());
        Cat pushok = new Cat();
        if (cats.contains(pushok)) {
            System.out.println("Yes");
        } else System.out.println("No");

    }
}
