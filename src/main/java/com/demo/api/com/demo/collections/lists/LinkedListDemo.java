package com.demo.api.com.demo.collections.lists;

// LinkedList keeps order based on element entered.
// [1]-->[2]-->[3]-->[4]
// Good for removing elements from middle, next / away from middle


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List list = new LinkedList();

        list.add("satish");
        list.add("mike");
        list.add("john");
        list.add("sam");
        list.add(null);


        // Allow duplicates

        list.add("satish");
        list.add("mike");
        list.add("john");
        list.add("sam");

        list.add(null);
        System.out.println(list);

    }
}
