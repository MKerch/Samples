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
public class BinarySearchInterfaceImpl implements BinarySearchInterface{

    @Override
    public int search(int[] arr, int value) {
        int l = 0, r = arr.length - 1;
        while (l<=r){
            int m = l+(r-l)/2;
 
            // Check if value is present at mid
            if (arr[m] == value)
                return m;
 
            // If value greater, ignore left half
            if (arr[m] < value)
                l = m + 1;
 
            // If value is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was 
        // not present
        return -1;
    }
    
}
