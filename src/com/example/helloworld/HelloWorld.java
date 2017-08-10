package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        int x = 0;
        int count = 3;
        
        System.out.println("Hello, World!");
        while (x < count) {
            System.out.println(count);
            x++;
        }
        System.out.println(x);
    }
}
