/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author Hakan58
 */
public class Node {
    String name;
    int number;
    Node next;
    Node prev;
    
    public Node()
    {
        this.next=null;
        this.prev=null;
    }
    public Node(String name , int number)
    {
        this.name=name;
        this.number=number;
        this.next=null;
        this.prev=null;
    }
    
}
