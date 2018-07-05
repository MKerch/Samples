/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cloning;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kerch
 */
public class BookShop implements Cloneable{

    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void loadBooks(){
        
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setBid(i);
            book.setBname("Book "+i);
            getBooks().add(book);
        }
        
    }
    
    @Override
    public String toString() {
        return "BookShop{" + "shopName=" + shopName + ", books=" + books + '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
