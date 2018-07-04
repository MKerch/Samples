/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enumeration names;
        String key;

        // Creating a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Adding Key and Value pairs to Hashtable
        hashtable.put("Key1", "Chaitanya");
        hashtable.put("Key2", "Ajeet");
        hashtable.put("Key3", "Peter");
        hashtable.put("Key4", "Ricky");
        hashtable.put("Key5", "Mona");

        names = hashtable.keys();
        while (names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " + key + " & Value: " + hashtable.get(key));
        }
        System.out.println("--------------------------------------------------");
        //Checking if the object contains in map
        boolean contains = hashtable.contains("Peter");
        System.out.println("HashTable contains value: "+contains);
        
        //Checking if the object contains in the hashtable
        boolean empty = hashtable.isEmpty();
        System.out.println("Is hashTable empty: "+empty);
        
        String remove = hashtable.remove("Key4");
        System.out.println("Element " + "\""+remove+"\""+ " was removed");
        
        System.out.println("--------------------------------------------------");
        
        String replace = hashtable.replace("Key5", "Max");
        names = hashtable.keys();
        while (names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " + key + " & Value: " + hashtable.get(key));
        }
    }

}
