/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linear.search;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = new int[]{1,4,5,6,5,34,67,8};
        
        SearchInterface searchInterface = new SearchInterfaceImpl();
        int searchValue = searchInterface.search(array, 4);
        System.out.println(searchValue);
        
    }
    
}
