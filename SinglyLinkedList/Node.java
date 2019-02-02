/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Hakan58
 */
public class Node {
    String name;
    int number;
    Node next;
    
    public Node(String name , int number)
    {
        this.name=name;
        this.number=number;
        this.next=null;
    }
}
