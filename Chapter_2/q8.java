package chapter2;
import CTCI_library.Node;

/**
 *
 * @author kenwoo
 */
public class q8 {
    
    public static Node detectCycle(Node head) {
        if(head == null || head.next == null) return null;
        Node ptr1 = head, ptr2 = head;
        while(ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if(ptr1 == ptr2) {
            	ptr1 = head;
                while(ptr1 != ptr2) {
					ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                return ptr1;
            }
        }
        return null;
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
        
        Node loopStart = new Node(5);
        ptr1.next = loopStart;
        ptr1 = ptr1.next;
        ptr1.next = new Node(6);
        ptr1 = ptr1.next;
        ptr1.next = new Node(7);
        ptr1 = ptr1.next;
        ptr1.next = new Node(8);
        ptr1 = ptr1.next;
        ptr1.next = loopStart;
        
        System.out.println(detectCycle(l1).data);
    }
}