// package Recursion;

public class Prog02 {
    public static void printN(int n,int i){
        if(n!=1){
            printN(n-1, i+1);
        }
        System.out.println(i);
    }
    public static void main(String[] args) {
        printN(5, 1);
    }
    
}
