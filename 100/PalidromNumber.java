// package 100;

public class PalidromNumber {
    public static boolean isPalindrome(int n){
        int num = n;
        int rev = 0;
        while(num!=0){
            rev *=10;
            rev+=num%10;
            num/=10;

        }
        if(rev == n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }
}
