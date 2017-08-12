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
public class q6 {
     public static boolean isPalindrome(Node head) {
        
        if(head == null) return true;
        
        Node slow = head, fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast != null) {
            slow = slow.next;
        }
        
        Node reversed = reverseList(slow);
        
        while(reversed != null) {
            if(head.data != reversed.data) return false;
            reversed = reversed.next;
            head = head.next;
        }
        
        return true;
    }
    
    public static Node reverseList(Node head) {
        Node prev = null;
        while(head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node ptr1 = l1;
        
        ptr1.next = new Node(2);
        ptr1 = ptr1.next;
        ptr1.next = new Node(3);
        ptr1 = ptr1.next;
        ptr1.next = new Node(1);
        ptr1 = ptr1.next;
        ptr1.next = null;
        
        System.out.println(isPalindrome(l1));
    }
}
