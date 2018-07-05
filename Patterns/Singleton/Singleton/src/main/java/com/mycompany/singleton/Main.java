/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///Get the only object available
      SingletonObject object = SingletonObject.getInstance();

      //show the message
      object.showMessage();
    }
    
}
