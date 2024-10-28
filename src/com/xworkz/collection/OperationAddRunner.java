package com.xworkz.collection;

public class OperationAddRunner {

    public static void main(String[] args) {

        int a[] ={23,45,67,145,567};
        OperationAdd op = array->{
            for (int value:a){
                if(value %2 != 0)
                    System.out.println(value);
            }
        };
        op.add(a);
    }
}
