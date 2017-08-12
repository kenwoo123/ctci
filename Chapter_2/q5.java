package chapter2;
import CTCI_library.Node;

/**
 *
 * @author kenwoo
 */
public class q5 {
    
    static class Wrapper {
        int carry;
        
        public Wrapper() {
             this.carry = 0;
        }
    }
    
    public static int length(Node head) {
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
    
    public static Node padList(Node head, int difference) {
        while(difference > 0) {
            Node n = new Node(0);
            n.next = head;
            head = n;
            difference--;
        }
        return head;
    }
    
    public static Node sumListRecursive(Node l1, Node l2) {
        Wrapper wrap = new Wrapper();
        Node ptr1 = l1, ptr2 = l2;
        Node first, second;
        int len1 = length(l1), len2 = length(l2);
        
        
        first = len1 > len2 ? l2 : l1;
        second = len1 > len2 ? l1 : l2;
        
        first = padList(first, Math.abs(len1 - len2));
        
        Node sumNode =  sumHelper(wrap, first, second);
        
        if(wrap.carry == 1) {
            Node carry = new Node(1);
            carry.next = sumNode;
            sumNode = carry;
        }
        
        return sumNode;
    }
    
    public static Node sumHelper(Wrapper wrap, Node o1, Node o2) {
        
        if(o1 == null && o2 == null) {
            return null;
        }
        
        Node curr = new Node(0);
        Node next = sumHelper(wrap, o1.next, o2.next);
        
        int sum = o1.data + o2.data + wrap.carry;
        wrap.carry = sum / 10;
        curr.data = sum % 10;
        curr.next = next;
        
        return curr;
    }
    
    public static Node sumList(Node l1, Node l2) {
        Node ptr1 = l1, ptr2 = l2;
        Node sumList = new Node(0);
        Node ptr3 = sumList;
        int carry = 0;
        
        while(ptr1 != null || ptr2 != null) {
            int first = ptr1 == null ? 0 : ptr1.data;
            int second = ptr2 == null ? 0 : ptr2.data;
            
            int sum = first + second + carry;
            
            carry = sum > 9 ? 1 : 0;
            
            sum = sum % 10;
            
            ptr3.next = new Node(sum);
            ptr3 = ptr3.next;
                
            if(ptr1 != null)
                ptr1 = ptr1.next;
            
            if(ptr2 != null)
                ptr2 = ptr2.next;
        }
        
        if(carry == 1)
            ptr3.next = new Node(carry);
        
        return sumList.next;
    }
    
    public static void main(String[] args) {
        Node l1 = new Node(5);
        Node l2 = new Node(5);
        
        Node ptr1 = l1, ptr2 = l2;
        
        ptr1.next = new Node(7);
        ptr1 = ptr1.next;
        ptr1.next = new Node(9);
        ptr1 = ptr1.next;
        ptr1.next = null;

        ptr2.next = new Node(1);
        ptr2 = ptr2.next;
        ptr2.next = new Node(4);
        ptr2 = ptr2.next;
        ptr2.next = new Node(3);
        ptr2 = ptr2.next;
        ptr2.next = null;
        
        
        Node sum = sumList(l2, l1);
        Node sumR = sumListRecursive(l2, l1);
        
        while(sum != null) {
            System.out.print(sum.data);
            sum = sum.next;
        }
        System.out.println();
        while(sumR != null) {
            System.out.print(sumR.data);
            sumR = sumR.next;
        }
    }
    
}
