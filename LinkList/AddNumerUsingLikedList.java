class Node {
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(){
    }
}
public class AddNumerUsingLikedList {
    public static Node arrToLinkedList(int[] arr){
        Node head = new Node();
        Node mover = head;
        for(int i: arr){
            mover.data =i;
            Node tmp = new Node();
            mover.next = tmp;
            mover = tmp;
        }
        return head;
    }

    public static void printLinkedLisr(Node head){
        Node mover = head;
        while(mover.next != null){
            System.out.println(mover.data);
            mover = mover.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {2,1,1};
        int[] arr2 = {9,9,1};
        Node head1 = arrToLinkedList(arr1);
        printLinkedLisr(head1);
    }
}
