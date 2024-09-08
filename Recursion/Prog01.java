// package Recursion;

public class Prog01 {
    public static void printName(int n, String name){
        if(n!=1){
            printName(n-1, name);
        }
        System.out.println(name+" "+n);

    }
    public static void main(String[] args) {
        printName(5, "vishal");
    }
}
