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
public class SinglyLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFront("a",1);
        list.addFront("b",2);
        list.addBack("c", 3);
        list.print();
        
        System.out.println();
        list.addToIndex("aaa", 0, 0);
        list.print();
        
        System.out.println();
        list.addToIndex("aaa", -1, 30);
        list.print();
        
        System.out.println();
        list.addToIndex("bbb", 11, 2);
        list.print();
        
        System.out.println();
        list.removeFront();
        list.print();
        
        System.out.println();
        list.removeBack();
        list.print();
        
        System.out.println();
        list.removeToIndex(2);
        list.print();

        
    }
    
}
