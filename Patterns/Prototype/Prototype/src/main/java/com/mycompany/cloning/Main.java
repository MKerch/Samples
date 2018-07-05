/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cloning;

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
        shop.getBooks().remove(2);
        System.out.println(shop);
        
        BookShop shop2 = (BookShop)shop.clone();
        shop2.setShopName("Galary");
        shop2.loadBooks();
        System.out.println(shop);
    }
    
}
