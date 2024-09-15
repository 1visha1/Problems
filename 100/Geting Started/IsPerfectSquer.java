// package 100;

public class IsPerfectSquer {
    public static boolean isPerferct(int n){
        int sqr = (int)Math.sqrt(n);
        return n==sqr*sqr;

    }
    public static void main(String[] args) {
        System.out.println(isPerferct(99+2));
    }
}
