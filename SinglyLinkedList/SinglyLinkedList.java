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
public class SinglyLinkedList {
    Node head;
    Node tail;
    
    public SinglyLinkedList()
    {
        head = null;
        tail= null;
    }
    
    public boolean isFull()
    {
        if(head != null)
            return true;
        else
            return false;
    }
    
    public void addFront (String name, int number)
    {
        Node newNode = new Node(name,number);
        if(isFull())
        {
            newNode.next=head;
            head = newNode;
        }
        else
        {
            head = newNode;
            tail= newNode;
        }
    }
    
    public void addBack(String name, int number)
    {
        Node newNode = new Node(name,number);
        if(isFull())
        {
            tail.next = newNode;
            tail = newNode;
        }
        else
        {
            head = newNode;
            tail = newNode;
        }
    }
    public void addToIndex(String name , int number, int index)
    {
        Node newNode = new Node(name,number);
        if(isFull())
        {
           if(index == 0)
           {
               newNode.next = head;
               head = newNode;
           }
           else
           {
                int temp=0;
                Node pointer1 = null;
                Node pointer2 = head;
                while (pointer2 != null && temp < index)
                {
                    pointer1 = pointer2;
                    pointer2 = pointer2.next;
                    temp++;
                }
                if(pointer2==null)
                {
                    tail.next=newNode;
                    tail = newNode;
                }
                else
                {
                    newNode.next = pointer2;
                    pointer1.next = newNode;
                }
                
           }
        }
        else
        {
            head = newNode;
            tail = newNode;
        }
    }
    
    public void removeFront()
    {
        if(isFull())
        {
            if(head == tail)
            {
                //listede tek eleman varsa.
                head = null;
                tail = null;
            }
            else
            {
                Node temp = head.next;
                head.next = null;
                head = temp;
            }
        }
    }
    
    public void removeBack()
    {
        if(isFull())
        {
            if(head == tail)
            {
                //listede tek eleman varsa.
                head = null;
                tail = null;
            }
            else
            {
                Node temp = head;
                while(temp.next != tail)
                {
                    temp = temp.next;
                }
                temp.next=null;
                tail = temp;
            }
        }
    }
    
    public void removeToIndex(int index)
    {
        if(isFull() && index >=0)
        {
            if(head==tail)
            {
                //tek eleman varsa
                head=null;
                tail=null;
            }
            else
            {
                if(index==0)
                {
                    Node newNode = head.next;
                    head.next = null;
                    head = newNode;
                }
                else
                {
                 //en az iki elaman var ve basta degil
                    Node pointer1=null;
                    Node pointer2=head;
                    int temp=0;
                    while(pointer2 != null && temp<index)
                    {
                        pointer1 = pointer2;
                        pointer2 = pointer2.next;
                        temp++;
                    }
                    if(pointer2 != null)
                    {
                        if(pointer2 == tail)
                        { // sondakini silme
                            tail = pointer1;
                            pointer1.next = null;
                        }
                        else
                        { //ortadan silme
                            pointer1.next = pointer2.next;
                            pointer2.next = null;
                        }
                            
                    }
                }
            }
        }
    }
    
    
    public void print()
    {
        Node pointer = head;
        while (pointer != null)
        {
            System.out.print(pointer.name + " "+ pointer.number + " , ");
            pointer = pointer.next;
        }
    }
    
}
