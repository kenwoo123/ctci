/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import CTCI_library.Node;

/**
 * @author kenwoo
 */
public class q3 {
    public static Boolean deleteMiddleNode(Node x) {
        Node p1 = x;
        
        //Check if next element exist
        if(p1 != null && p1.next != null) {
            //Replace current element with next element
            p1.data = p1.next.data;
            //Delete next element
            p1.next = p1.next.next;
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Node n = new Node(5);
        Node head = n;
        
        n.next = new Node(3); n = n.next;
        n.next = new Node(3); n = n.next;
        n.next = new Node(4); Node mid = n; n = n.next;
        n.next = new Node(5); n = n.next;
        n.next = new Node(3); n = n.next;
        
        System.out.println(deleteMiddleNode(mid));
        
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " " );
            temp = temp.next;
        }
    }
}
