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
public class RecurtionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int fibonacci = fibonacci(20);
        
        System.out.println(fibonacci);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
