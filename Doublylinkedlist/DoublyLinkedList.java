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
public class DoublyLinkedList {
    Node head = new Node();
    Node tail= new Node();
    
    
    public DoublyLinkedList()
    {
        head.next=tail;
        tail.prev=head;
    }
    
    public boolean isFull()
    {
       return (head.next==tail);
    }
    
    public void add(Node v, String name, int number)
    {
        Node newNode = new Node(name,number);
       
            newNode.next = v;
            newNode.prev = v.prev;
            v.prev.next = newNode;
            v.prev = newNode;     
        
    }
    public void addFront(String name, int number)
    {
        add(head.next, name , number);
    }
    public void addBack(String name, int number)
    {
        add(tail, name, number);
    }
    
    public void remove(Node v)
    {
        Node pointer1 = v.prev;
        Node pointer2 = v.next;
        pointer1.next = pointer2;
        pointer2.prev = pointer1;
        
    }
    public void removeFront()
    {
        remove(head.next);
    }
    public void removeBack()
    {
        remove(tail.prev);
    }

     public void print()
    {
        if (isFull())
	{
		System.out.println("List is empty !");
		return;
	}
        Node pointer = head;
        while (pointer.next != tail)
        {
            System.out.print(pointer.next.name + " "+ pointer.next.number + " , ");
            pointer = pointer.next;
        }
    }
   
}
