/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arraylist;

import java.util.ArrayList;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> obj = new ArrayList<>();

        /*This is how elements should be added to the array list*/
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

        /* Displaying array list elements */
        System.out.println("Currently the array list has following elements:" + obj);

        /*Add element at the given index*/
        obj.add(0, "Rahul");
        obj.add(1, "Justin");

        /*Remove elements from array list like this*/
        obj.remove("Chaitanya");
        obj.remove("Harry");
        System.out.println("Current array list is:" + obj);

        /*Remove element from the given index*/
        obj.remove(1);
        System.out.println("Current array list is:" + obj);
        
        /*Returns the object of list which is present at the specified index.*/
        String str= obj.get(2);
        System.out.println(str);
        
        /*It gives the size of the ArrayList – Number of elements of the list.*/
        int numberofitems = obj.size();
        System.out.println(numberofitems);
        
        /*It checks whether the given object o is present in the array list if its there then it returns true else it returns false.*/
        boolean contains = obj.contains("Steve");
        System.out.println(contains);
        
    }

}
