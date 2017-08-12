/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import CTCI_library.Node;
import java.util.HashSet;

/**
 *
 * @author kenwoo
 */
public class q1 {
    public static Node removeDuplicates(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        while(temp!= null && temp.next != null) {
            set.add(temp.data);
            if (set.contains(temp.next.data)) {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;       
        }
        return head;
    }
    
    public static void main(String[] args) {
        Node n = new Node(5);
        Node head = n;
        
        n.next = new Node(3); n = n.next;
        n.next = new Node(3); n = n.next;
        n.next = new Node(4); n = n.next;
        n.next = new Node(5); n = n.next;
        n.next = new Node(3); n = n.next;
        
        head = removeDuplicates(head);
        
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " " );
            temp = temp.next;
        }
    }
}
