// package Recursion;

public class FactOfN {
    public static int fact(int n){
        if(n==1)return 1;
        return n*fact(n-1);
    }
    public static void fact(int n, int i){
        if(n==0){
            System.out.println(i);

            return;
        }
        i*=n;
        fact(n-1,i);

    }
    public static void main(String[] args) {
        // System.out.println(fact(5));
        fact(5,1);
    }
}
