package com.xworkz.collection;

public class OperationRunner {

    public static void main(String[] args) {

        int a[] = {56,67,67,78,114};
      Operation op =  array -> {
            for(int value:a){
                if(value % 2 == 0)
                    System.out.println(value);
            }
        };
      op.even(a);
    }
}
