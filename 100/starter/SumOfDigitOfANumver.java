// package 100.starter;

public class SumOfDigitOfANumver {
    public static int sum(int n){
        int sum =0;
        while (n!=0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(123));
    }
}
