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
public class LinkedList
{

    private Node head = new Node();
    private int size = 0;

    public LinkedList()
    {
    }

    
    public LinkedList(int[] array)
    {
        head = null;
        size = array.length;
        for (int i = size - 1; i >= 0; i--)
        {
            head = new Node(array[i], head);
        }
    }

    public int getSize()
    {
        int count = 0;
        Node n = head;
        while (n.next != null)
        {
            n = n.next;
            count++;
        }
        return count;
    }

    public int getFirst()
    {
        return head.data;
    }

    public int getLast()
    {
        Node n = head;
        while (n.next != null)
        {
            n = n.next;           
        }
        return n.data;
    }
    
    void addNode(int data)
    {
        Node newNode = new Node(data);
        
        if (head == null)
        {
            head = new Node(data);
            return;
        }
        
        newNode.next = null;
        
        Node n = head;
        while (n.next != null)
        {
            n = n.next;           
        }
        n.next = newNode;
        
        size++;
    }
    
    String display()
    {
        StringBuilder s = new StringBuilder();
        Node n = head;
        while (n.next != null)
        {           
            s.append("Data: ").append(n.data).append(" - Next: ").append(n.next.data).append("\n");
            n = n.next;
        }
        return s.toString();
    }

}
