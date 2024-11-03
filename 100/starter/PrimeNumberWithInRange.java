// package 100.starter;

import java.util.ArrayList;
import java.util.List;
public class PrimeNumberWithInRange {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static List<Integer> primeRange(int a, int b){
        List<Integer> list = new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(isPrime(i))list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(primeRange(5, 15));
    }
}
