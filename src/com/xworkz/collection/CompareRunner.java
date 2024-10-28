package com.xworkz.collection;

public class CompareRunner {

    public static void main(String[] args) {
        String a[] = {"Abhi","12345","Kannada","Mysore"};
        Compare op = array->{
            for (String value:a){
                if(value == "Abhi")
                    System.out.println(value);
            }
        };
        op.compare(a);
    }
}
