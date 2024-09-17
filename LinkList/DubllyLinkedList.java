// package LinkList;
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
public class DubllyLinkedList {
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
    public static Node printDoubleLikedList(Node head){
        while(head.next != null){
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
        System.out.println();
        return head;
    }
    public static Node priNodeReverseLinkedList(Node tail){
        while(tail.prev != null){
            System.out.println(tail.data);
            tail = tail.prev;
        }
        System.out.println(tail.data);
        System.out.println();

        return tail;
    }
    public static Node deleteHead(Node head){
        if(head!=null&&head.next!=null){
            Node prev = head;
            head= head.next;
            head.prev = null;
            prev.next = null;
            return head;
        }
        return null;
    }
    public static Node deleteTail(Node head){
        Node h1 = head;
        while(head.next!=null){
            head= head.next;
        }
        Node next = head;
        head = head.prev;
        next.prev = null;
        head.next = null;
        return h1;
    }
    public static Node deleteKthNode(Node head, int k){
        if(k==1)return deleteHead(head);
        Node tmp = head;
        int cnt =1;
        while(tmp.next != null && cnt != k){
            tmp = tmp.next;
            cnt++;
        }
        if(cnt<k)return head;
        if(cnt == k&&tmp.next == null) return deleteTail(head);
        if(cnt == k){
        
            
            tmp.prev.next = tmp.next;
            tmp.next.prev = tmp.prev;
            tmp.next = null;
            tmp.prev = null;
        }
        return head;

        
        
    }
    
    public static void deleteNode(Node node){
        if(node.next == null){
            node.prev.next = null;
            node.prev = null;
        }else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = null;
            node.prev = null;
        }
    }
    public static Node insertBeforeHead(Node head, int data){
        Node node = new Node(data);
        node.next = head;
        head.prev = node;
        return node;
    }
    public static void insertBeforTail(Node head, int data){
        while(head.next!=null){
            head= head.next;
        }
        Node node = new Node(data);
        node.next = head;
        node.prev = head.prev;
        head.prev = node;
        node.prev.next = node;
    }
    public static Node insertBeforKthNode(Node head, int data, int k){
        if(k==1) return insertBeforeHead(head, data);
        Node tmp = head;
        int cnt =1;
        while(tmp.next != null){
            if(cnt == k)break;
            cnt++;
            tmp = tmp.next;
        }if(cnt == k){
            Node node = new Node(data);
            node.next = tmp;
            node.prev = tmp.prev;
            tmp.prev = node;
            node.prev.next = node;
        }
        return head;
    }
    public static void insertBeforeNode(Node node, int data){
        Node tmp = new Node(data);
        tmp.prev = node.prev;
        node.prev = tmp;
        tmp.next = node;
        
        tmp.prev.next = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Node head = arrayToDubLikedList(arr);
        // head = deleteHead(head);
        
        Node tail = printDoubleLikedList(head);
        insertBeforeNode(tail, 90);
        printDoubleLikedList(head);
        priNodeReverseLinkedList(tail);

    }
}
