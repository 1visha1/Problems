// package 100;

public class FriendlyPair {
    public static int factSumRatio(int n){
        int s =0;
        for(int i=1;i<=n;i++){
            if(n%i==0)s+=i;
        }
        return s/n;
    }
    public static boolean isFriendlyPair(int n, int m){
        return factSumRatio(n)==factSumRatio(m);
    }
    public static void main(String[] args) {
        System.out.println(isFriendlyPair(6,28));
    }
}
