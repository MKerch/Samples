/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author kerch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    MergeSortImpl merge = new MergeSortImpl();    
    
    int[] numArray = new int []{1,4,3,5,6,7,4,5,34,54,23,56,67};
    merge.sort(numArray,0,numArray.length-1);
    
        for (int i : numArray) {
            System.out.println(i + " ");
        }
    }
}
