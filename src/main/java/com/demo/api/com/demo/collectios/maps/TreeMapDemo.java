package com.demo.api.com.demo.collectios.maps;

// Key and value pair

// the latest key will over the old value.

// Keeps natural order

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {


    public static void main(String[] args) {

        Map map = new TreeMap();

        map.put("s","sam");
        map.put("m","mark");
        map.put("f","frank");
        map.put("q","queen");
        map.put("a","ana");
        map.put("m","michal");






        System.out.println(map);

    }
}
