// package 100;

public class StrongNumber {
    public static int fact(int n){
        if(n<=1)return 1;
        return n*fact(n-1);
    }

    public static boolean isStrong(int n){
        int num = n;
        int s=0;
        while(num !=0){
                int rem = num%10;
                num/=10;
                s+=fact(rem);
        }
        return s==n;
    }

    public static void main(String[] args) {
        System.out.println(isStrong(14));
    }
}
