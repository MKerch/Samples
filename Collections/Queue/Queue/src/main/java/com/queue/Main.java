/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
       * We cannot create instance of a Queue as it is an
       * interface, we can create instance of LinkedList or
       * PriorityQueue and assign it to Queue
       */
      Queue<String> q = new LinkedList<>();    
      //Adding elements to the Queue
      q.add("Rick");
      q.add("Maggie"); 
      q.add("Glenn");
      q.add("Negan");
      q.add("Daryl");
	    
      System.out.println("Elements in Queue:"+q);
      /*
       * We can remove element from Queue using remove() method,
       * this would remove the first element from the Queue 
       */
      System.out.println("Removed element: "+q.remove());    
      /*
       * element() method - this returns the head of the
       * Queue. Head is the first element of Queue. Retrieves the value of the 
       * first element without removing it. 
       * Unlike peek(), however, if the list 
       * is empty element() throws a NoSuchElementException
       */
      System.out.println("Head: "+q.element());   
      /*
       * poll() method - this removes and returns the 
       * head of the Queue. Returns null if the Queue is empty
       */
      System.out.println("poll(): "+q.poll());
      /*
       * peek() method - it works same as element() method,
       * however it returns null if the Queue is empty
       */
      System.out.println("peek(): "+q.peek());
      
      //Again displaying the elements of Queue
      System.out.println("Elements in Queue:"+q);
   
    }
    
}
