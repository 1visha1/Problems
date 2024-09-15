// package 100;

public class PerfectNumber {
    public static boolean isperfect(int n){
        int s =0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)s+=i;
        }

        return s == n;
    }
    public static void main(String[] args) {
        System.out.println(isperfect(6));
    }
}
