/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swap;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Before Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);

        //swap the value
        swap(x, y);
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);

    }

}
