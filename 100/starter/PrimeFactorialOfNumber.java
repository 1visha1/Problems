// package 100.starter;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactorialOfNumber {
    public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }

    public static List<Integer>  prime(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0 && isPrime(i)) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(prime(26));
    }
}
