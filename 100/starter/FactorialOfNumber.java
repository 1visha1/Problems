// package 100.starter;

public class FactorialOfNumber {
    public static int fact(int n){
        int last=1;
        for(int i=1;i<=n;i++){
            last = i*last;
        }
        return last;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
