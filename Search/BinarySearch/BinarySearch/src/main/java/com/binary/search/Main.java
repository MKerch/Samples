/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.binary.search;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {1,2,3,5,7,9,11,22,34,55};
        
        BinarySearchInterface binarySearchInterface = new BinarySearchInterfaceImpl();
        int search = binarySearchInterface.search(array, 9);
        System.out.println(search);
        
    }
    
}
