/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import CTCI_library.Node;

/**
 *
 * @author kenwoo
 */
public class q2 {
       public static void kToLast(Node head, int n) {
        Node p1 = head;
        Node p2 = head;
        
        for (int i = n; i > 1; i--) {
            if(p2.next != null) {
                p2 = p2.next;
            } else {
                System.out.println("Out of Bounds");
            }
        }
        
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        System.out.println("kth to last element = " + p1.data);
    }
    
    public static int kToLastRecursive(Node head, int n) {
        //Base case: Reached the end
        if(head == null) {
            return 0;
        }
        
        //Recursive call to increment index using stack
        int index = kToLastRecursive(head.next, n) + 1;
        
        //Condition to print
        if(index == n) {
            System.out.println(head.data);
        }
        return index;
    }
    
    public static void main(String[] args) {
        Node n = new Node(5);
        Node head = n;
        
        n.next = new Node(3); n = n.next;
        n.next = new Node(3); n = n.next;
        n.next = new Node(4); n = n.next;
        n.next = new Node(5); n = n.next;
        n.next = new Node(3); n = n.next;
        
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " " );
            temp = temp.next;
        }
        
        kToLast(head, 3);
        kToLastRecursive(head, 3);
    }
}
