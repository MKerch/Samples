/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deep.cloning;

import com.mycompany.cloning.*;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.setShopName("Bookva");
        shop.loadBooks();
        System.out.println(shop);

        
        //two different objects. Deletion does not affect on cloned object 
        BookShop shop2 = shop.clone();
        shop.getBooks().remove(2);
        shop2.setShopName("Galary");
        shop2.loadBooks();
        System.out.println(shop);
    }

}
