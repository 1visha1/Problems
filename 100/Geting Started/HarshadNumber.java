// package 100;

public class HarshadNumber {
    public static int sumOfDigit(int n){
        int s=0;
        while (n!=0) {
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static boolean isHarsged(int n){
        int sum = sumOfDigit(n);
        if(n%sum ==0){
            return true;

        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHarsged(22));
    }
}
