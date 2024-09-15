// package 100;

public class FibonaciSerise {
    public static void serise(int n){
        int n1 =0;
        int n2 =1;
        System.out.println(n1);
        while (n2<=n) {
           System.out.println(n2);
           int tmp = n2;
           n2 = n1+n2;
           n1 =  tmp;
        }
    }
    public static void main(String[] args) {
        serise(10);
    }
}
