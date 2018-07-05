/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.builder;

/**
 *
 * @author kerch
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Phone phone = new PhoneBuider().setOs("Android").setRam(2).
                setProcessor("QualComm").setScreenSize(5.5).setBattery(1200).getPhone();
        
        System.out.println(phone);
    }
    
}
