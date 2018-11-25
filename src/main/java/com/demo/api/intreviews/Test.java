package com.demo.api.intreviews;

public class Test {

    public static void main(String[] args) {

        Person emp = new Employee();

        emp.test();
    }
}

class Person {


    void test(){

        System.out.println("Person..Test method");
    }
}

class Employee extends Person {

      void test(){

        System.out.println("Employee..Test method ");

    }

}