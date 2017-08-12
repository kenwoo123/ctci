package chapter2;
import CTCI_library.Node;

/**
 *
 * @author kenwoo
 */
public class q4 {
    public static Node partition(Node head, int x) {
        if(head == null) return null;
        
        Node smallList = new Node(0);
        Node largeList = new Node(0);
        Node small = smallList;
        Node large = largeList;
        
        Node ptr = head;
        
        while(ptr != null) {
            if(ptr.data < x) {
                smallList.next = new Node(ptr.data);
                smallList = smallList.next;
            } else {
                largeList.next = new Node(ptr.data);
                largeList = largeList.next;
            }
            ptr = ptr.next;
        }
        
        if(largeList != null)
            largeList.next = null;
        
        smallList.next = large.next;
        
        return small.next;
    }
    
    public static void main(String[] args) {
        Node n = new Node(5);
        Node head = n;
        
        n.next = new Node(3); n = n.next;
        n.next = new Node(3); n = n.next;
        n.next = new Node(4); n = n.next;
        n.next = new Node(5); n = n.next;
        n.next = new Node(3); n = n.next;
        
        head = partition(head, 3);
        
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " " );
            temp = temp.next;
        }
    }
}
