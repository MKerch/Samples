/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insertion.sort;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    InsertionSortImpl insertion = new InsertionSortImpl();    
    
    int[] numArray = new int []{1,4,3,5,6,7,4,5,34,54,23,56,67};
    insertion.insertionSort(numArray);
    
        for (int i : numArray) {
            System.out.println(i + " ");
        }
    }
}
