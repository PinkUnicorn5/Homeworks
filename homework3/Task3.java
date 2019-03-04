package com.epam.homework3;

public class Task3 {
    public static void main(String[] args) {
        int c = 5;
        for (int i = c - 1; i >= 0; i--){
            for (int a = 0; a < c; a++){
                if (a < i){
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}