package com.xworkz.collection;

public class AdditionRunner {

    public static void main(String[] args) {

        Addition addition =(a, b)->{
            System.out.println(a+b);
        };
        addition.add(67 ,9);
    }
}
