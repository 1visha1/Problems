// package 100.starter;

public class StrongNumber {
    public static int fact(int n){

        int fact =1;
        for(int i=1;i<=n;i++){
            fact = i*fact;
        }
        return fact;
    }

    public static boolean isStrong(int n){
        int sum =0;
        int tmp =n;
        while(tmp != 0){
            sum+=fact(tmp%10);
            tmp/=10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println((isStrong(145)));
    }
}
