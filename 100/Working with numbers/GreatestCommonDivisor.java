// package 100.Working with numbers;

public class GreatestCommonDivisor {
    public static int gcd(int n, int m){
        if(n>m){
            int tmp = n;
            n=m;
            m=tmp;
        }
        int gcd = 1;
        for(int i=1;i<=n;i++){
            if(n%i == 0 && m%i ==0) gcd = i;
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcd(10,5));
    }
}
