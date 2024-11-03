// package 100.starter;

public class PrimeNumer {
    
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
