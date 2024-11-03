// package 100.starter;

public class PalidromNumber {

    public static boolean isPalidrom(int n){
        int r=0;
        int tmp = n;
        while(tmp !=0){
            r*=10;
            r+=tmp%10;
            tmp/=10;
        }
        return n==r;
    }
    public static void main(String[] args) {
        System.out.println(isPalidrom(10101 ));
    }
}
