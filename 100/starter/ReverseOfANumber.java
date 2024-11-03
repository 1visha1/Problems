// package 100.starter;

public class ReverseOfANumber {
    public static int reverse(int n){
        int reverse = 0;
        while(n!=0){
            reverse*=10;
            reverse+=n%10;
            n/=10;
        }

        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
