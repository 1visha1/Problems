// package 100;

public class PowerOfANumber {
    public static int power(int n, int pow){
        while(pow >1){
            pow--;
            n*=n;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
