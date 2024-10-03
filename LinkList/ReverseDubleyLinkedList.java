import java.security.PublicKey;
import java.util.Stack;

class Node{
    int data;
    Node next, prev;
    Node(int data, Node next, Node prev){
        this.data = data;
        this.next=next;
        this.prev = prev;
    }
    Node(int data){
        this.data = data;
        this.next=null;
        this.prev = null;
    }
    Node(){

    }
}
public class ReverseDubleyLinkedList {
    public static Node arrayToDubLikedList(int arr[]){
        Node head = new Node();
        Node tmp = head;
        head.prev = null;
        for(int i:arr){
            tmp.data = i;
            Node node = new Node();
            tmp.next = node;
            node.prev =tmp;
            tmp = node;
        }
        
        tmp.prev.next = null;
        return head;
    }
    public static Node reverseListUsingStack(Node head){
        Node tmp = head;
        Stack<Integer> stack = new Stack<>();
        while(tmp.next != null){
            stack.push(tmp.data);
            tmp = tmp.next;
        }
        tmp = head;
        while(tmp.next != null){
            tmp.data=stack.pop();
            tmp= tmp.next;
        }
        return head;
    }
    public static Node printDoubleLikedList(Node head){
        while(head.next != null){
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
        System.out.println();
        return head;
    }
    public static Node reverseList(Node head){
        if(head==null||head.next==null)return head;
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next=prev;
            curr = curr.prev;

        }
        return prev.prev;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Node head = arrayToDubLikedList(arr);
        printDoubleLikedList(head);
        head = reverseList(head);
        printDoubleLikedList(head);

    }
}
