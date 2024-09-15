// package 100;

public class ReversANumber {
    public static int revNum(int n){
        int rev = 0;
        while(n!=0){
            rev *=10;
            rev +=n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(revNum(123));
    }
}
