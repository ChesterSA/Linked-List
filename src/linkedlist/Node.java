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
public class Node
{
    int data;
    Node next;

    Node()
    {
    }

    Node(int data)
    {
        this.data = data;
        next = null;
    }

    public Node(Node next)
    {
        this.next = next;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
