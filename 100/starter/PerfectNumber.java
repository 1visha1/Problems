// package 100.starter;


public class PerfectNumber {
    public static boolean isPerfect(int n){
        int perfect = 0;
        for(int i=1;i<=n/2;i++){
            perfect+=n%i==0?i:0;

        }
        return perfect == n;
    }
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }
}
