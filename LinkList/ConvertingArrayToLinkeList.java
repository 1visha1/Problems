// package LinkList;

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

public class ConvertingArrayToLinkeList {
    public static Node deleteHead(Node head){
        if(head ==null)return head;
        head = head.next;
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
    public static Node removeTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tmp = head;
        while(tmp.next.next != null){
           tmp = tmp.next; 
        }
        tmp.next = null;
        return head;
    }
    public static Node deleteKthNode(Node head, int n){
        if(head ==null) return head;
        if(n==1){
            
            head = head.next;
            return head;
        }
        Node tmp = head;
        for(int i=1;i<n-1&&tmp.next!=null;i++){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return head;
    }
    public static Node deleteValue(Node head, int val){
        if(head ==null) return head;
        if(head.data == val){
            head = head.next;
            return head;
        }
        Node tmp = head;
        Node pre = head;
        while(tmp.next != null){
            if(tmp.data == val){
                pre.next = tmp.next;
            }
            pre = tmp;
            tmp = tmp.next;

        }
        return head;
    }
    public static Node insetPos(Node head, int pos,int data){
        if(head == null && pos == 1){
            Node tmp = new Node(data);
            return tmp;
        }
        if(head == null) return null;
        if(pos ==1){
            Node node = new Node(data,head);
            return node;
        }
        Node tmp = head;
        int c=1;
        while(tmp.next!= null ){
            if(c==pos-1){
                Node node = new Node(data,tmp.next);
                tmp.next=node;
                return head;
            }
            c+=1;
            tmp=tmp.next;

        }
        return head;
    }
    public static Node insertBefreVal(Node head, int val, int data){
        if(head == null) return null;
        Node tmp = head;
        if(head.data == val){
            Node node = new Node(data,head);
            return node;
        }
        while(tmp.next != null){
            if(tmp.next.data == val){
                Node node = new Node(data,tmp.next);
                tmp.next = node;
                return head;
            }   
            tmp= tmp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node();
        Node mover = head;
        int[] arr = {1,2,3,4,5};
        for(int i: arr){
            mover.data =i;
            Node tmp = new Node();
            mover.next = tmp;
            mover = tmp;
        }
        printLinkedLisr(head);
        head = insertBefreVal(head, 1, 0);
        printLinkedLisr(head);
        
    }
}
