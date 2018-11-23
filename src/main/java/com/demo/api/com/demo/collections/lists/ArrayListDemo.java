package com.demo.api.com.demo.collections.lists;

// Allows duplicate
// Keeps insertion order using indexes [0,1,2.............n]
// Known as Indexed Collection

// ArrayList keeps insertion order based on index position of the element

// Good remove elements from ends and getting elements by index

// Not good from remove elements from start and middle because it needs to shifts all the elements

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("satish");
        list.add("mike");
        list.add("john");
        list.add("sam");
        list.add(null);
        list.add("satish");
        list.add("mike");
        list.add("john");
        list.add("sam");

        list.add(null);
        System.out.println(list);

    }
}
