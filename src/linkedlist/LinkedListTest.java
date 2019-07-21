/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author cswan
 */
public class LinkedListTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList(new int[]{1,2,3,4,5});
        
        myList.addNode(2);
        
        System.out.println(myList.display());
        
        myList.addNode(6);
        
        System.out.println(myList.display());
    
    }
}
