// package 100.starter;

public class EvenOdd {

    public static boolean isEven(int n){
        return (n&1) == 0;
    }
    public static void main(String[] args) {
        
        System.out.println(isEven(5));
    }
}
