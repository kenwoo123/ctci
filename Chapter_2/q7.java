package chapter2;
import CTCI_library.Node;

/**
 *
 * @author kenwoo
 */
public class q7 {
    public static Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null) return null;
        
        Node ptr1 = headA;
        Node ptr2 = headB;
        
        while(ptr1 != ptr2) {
            ptr1 = ptr1 == null? headB : ptr1.next;
            ptr2 = ptr2 == null? headA : ptr2.next;
        }
        
        return ptr1;
    }
    
    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node ptr1 = l1;   
        ptr1.next = new Node(2);
        ptr1 = ptr1.next;
        ptr1.next = new Node(3);
        ptr1 = ptr1.next;
        ptr1.next = new Node(4);
        ptr1 = ptr1.next;
        
        Node l2 = new Node(1);
        Node ptr2 = l2;
        ptr2.next = new Node(2);
        ptr2 = ptr2.next;
        ptr2.next = new Node(3);
        ptr2 = ptr2.next;

        Node s1 = new Node(5);
        ptr1.next = s1; ptr1 = ptr1.next;
        ptr2.next = s1; ptr2 = ptr2.next;
        
        Node s2 = new Node(6);
        ptr1.next = s2; ptr1 = ptr1.next;
        ptr2.next = s2; ptr2 = ptr2.next;
   
        ptr1.next = null;
        ptr2.next = null;
        
        System.out.println(getIntersectionNode(l1, l2).data);
    }
}
