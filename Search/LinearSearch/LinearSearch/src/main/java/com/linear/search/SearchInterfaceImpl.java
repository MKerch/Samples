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
public class SearchInterfaceImpl implements SearchInterface{

    @Override
    public int search(int[] array, int value) {
     
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
                return i; 
            } 
        }
        return -1;
    }
    
}
