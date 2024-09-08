// package Recursion;
// sum of 1 to n
public class Prog03 {
    public static int sume(int n){
        if(n == 0 ){
            return 0;
        }
        return n+sume(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sume(5));
    }
}
