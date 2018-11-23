package com.demo.api.com.demo.collections.sets;

// Eliminates duplicates elements
// Random element insertion
// Allows only 1 null value

import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {


    public static void main(String[] args) {


          Set set = new HashSet();
          set.add("sam");
          set.add("elmo");
          set.add("jibin");
          set.add(null);
          set.add("mike");
          set.add(null);

        System.out.println(set);


    }
}
