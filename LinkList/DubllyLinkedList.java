// package LinkList;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;

    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
        this.prev = null;
    }
    Node(){

    }
}
public class DubllyLinkedList {
    public static Node arrayToLinkedList(Node head, int[] arr){
        if(arr.length<1){
            return null;
        }
        Node tmp = head;
        for(int i: arr){
            tmp.data = i;
            Node node = new Node();
            tmp.next = node;
            node.prev = tmp;
            tmp = tmp.next;
        }
        return head;
    }
    public static void printLinkedList(Node head){
        while(head.next != null){
            System.out.println(head.data);
            head = head.next;
        }

        System.out.println();
        head= head.prev;
        while (head.prev != null) {
            System.out.println(head.data);
            head = head.prev;
        }
        System.out.println(head.data);
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node head = new Node();
        arrayToLinkedList(head, arr);
        printLinkedList(head);
    }
}
