/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fibonacci;

/**
 *
 * @author kerch
 */
public class SimpleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int fibonacci = fibonacci(15);
        //System.out.println(fibonacci);

    }

    public static int fibonacci(int n) {

        int one = 0;
        int two = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(one + " ");
            one = one + two;
            two = one - two;
        }

        System.out.println();
        return one;
    }

}
