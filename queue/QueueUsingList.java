// package queue;
class Node{
    int data;
    Node back;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class QueueUsingList {
    static Node start;
    static Node end;
    public static void push(int data){
        Node node = new Node(data);
        if(end == null){
            start = node;
            end = start;
        }else{
            end.back= node;
            end = end.back;
        }
    }
    public static int pop(){
        if(end != null){
            end
        }
    }

    public static void main(String[] args) {
        
    }
    
}
