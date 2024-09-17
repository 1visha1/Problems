// package 100.Working with numbers;

public class OctalToDecimal {

    public static int dec(int n){
        int cnt =1;
        int sum=0;
        while(n!=0){
            sum+=(n%10)*cnt;
            n/=10;
            cnt*=8;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(dec(2001));
    }
}
