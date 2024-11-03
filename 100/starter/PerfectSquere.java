// package 100.starter;

public class PerfectSquere {
    public static boolean isPerfect(int n){
        return Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n));

    }
    public static void main(String[] args) {
        System.out.println(isPerfect(25));
    }
}
