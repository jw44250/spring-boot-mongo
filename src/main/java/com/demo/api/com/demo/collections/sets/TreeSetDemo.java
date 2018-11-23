package com.demo.api.com.demo.collections.sets;

// Elements are sorted based on their natural order
// Elements should mutual comparable if not than throws classCastException or Null Pointer Exception at Runtime
// Does not allow null value(s)

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {


    public static void main(String[] args) {


          Set set = new TreeSet();
          set.add(null);

          // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
          /*
          set.add("elmo");
          set.add("jibin");
          set.add(10);
          */

          //  java.lang.NullPointerException
         /* set.add("sam");
          set.add("elmo");
          set.add("jibin");
          set.add(null);
          set.add("mike");
          set.add(null);*/

        System.out.println(set);


    }
}
