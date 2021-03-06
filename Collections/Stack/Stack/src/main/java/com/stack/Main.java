/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stack;

import java.util.Stack;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Java Stack extends Vector class with the following five operations only.*/
        
        Stack<Integer> stack = new Stack<>();
        System.out.println("Empty stack: " + stack);
        System.out.println("Empty stack: " + stack.isEmpty());
        // Exception in thread "main" java.util.EmptyStackException
        // System.out.println("Empty stack : Pop Operation : "  + stack.pop());
        stack.push(1001);
        stack.push(1002);
        stack.push(1003);
        stack.push(1004);
        System.out.println("Non-Empty stack: " + stack);
        System.out.println("Non-Empty stack: Pop Operation: " + stack.pop());
        System.out.println("Non-Empty stack: After Pop Operation: " + stack);
        System.out.println("Non-Empty stack: search() Operation: " + stack.search(1002));
        System.out.println("Non-Empty stack: "  + stack.isEmpty());
        
        /*peek() looks at the object at the top of this stack without removing it from the stack*/
        System.out.println("peek(): "+ stack.peek());
    
    }
    
}
