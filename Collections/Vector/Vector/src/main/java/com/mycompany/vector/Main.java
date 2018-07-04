/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();

        /* Adding elements to a vector*/
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        /*check size and capacityIncrement*/
        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity increment is: " + vec.capacity());

        vec.addElement("fruit1");
        vec.addElement("fruit2");
        vec.addElement("fruit3");
        vec.addElement("fruit4");
        vec.addElement("fruit5");
        vec.addElement("fruit6");
        vec.addElement("fruit7");

        /*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after increment is: " + vec.capacity());

        /*Display Vector elements*/
        Enumeration en = vec.elements();
        System.out.println("\nElements are:");
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println(" ");
        
        /*Remove element "Apple"*/
        boolean remove = vec.remove("Apple");
        System.out.println("Element apple was remuved: " + remove + " ");
        /*Verification of existence element "Apple"*/
        boolean contains = vec.contains("Apple");
        System.out.println("Does vector contains an Apple value: " + contains);

        /*get value by index*/
        String get = vec.get(0);
        System.out.println("Index 0 has "+get+" string value");
    }

}
