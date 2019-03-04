package com.epam.homework3;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int a = 0; a<i; a++){
                System.out.print(" *");
            }
            System.out.println();
        }
        int c = 5;
        for (int i = c ; i >= 0; i--){
            for (int a = 0; a < c; a++){
                if (a >= i){
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
