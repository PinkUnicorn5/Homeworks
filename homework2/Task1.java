package com.epam.homework2;

import static jdk.nashorn.internal.objects.Global.print;

public class Task1 {
    public static void main(String[] args) {
        int a = 55, b = 93;
        print(a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        print(a, b);
    }

    private static void print(int a, int b){
        System.out.println("A = " + a + "; " + "B = " + b);
    }

}
