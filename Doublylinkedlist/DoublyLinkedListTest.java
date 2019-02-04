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
public class DoublyLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoublyLinkedList list = new DoublyLinkedList();
        list.addBack("a",1);
        list.addFront("b",2);
        list.addBack("c", 3);
        list.removeBack();
        list.removeFront();
        list.print();
        
       
    }
    
    
    
}
