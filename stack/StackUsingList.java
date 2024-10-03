// package stack;
import java.util.*;

class Node{
    int data;
    Node link;
    Node(int data, Node link){
        this.data = data;
        this.link = link;
    }
    Node(int data){
        this.data = data;
        this.link = null;
    }

}
public class StackUsingList {
    static Node top;
    public static void push(int data){
        Node node = new Node(data);
        node.link = top;
        top = node;
    }
    public static int pop(){
        Node n = top;
        top = top.link;
        n.link = null;
        return n.data;
    }
    public static void printStack(){
        Node n = top;
        while(n != null){
            System.out.println(n.data);
            n = n.link;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        push(2);
        push(4);
        push(9);
        printStack();
        pop();
        printStack();
    }
}
