// package 100.starter;

public class AbundantNumer {
    public static boolean isAbundant(int n){
        int s =0;
        for(int i=1;i<=n/2;i++){
            s+=n%i==0?i:0;
        }
        return n<s;
    }
    public static void main(String[] args) {
        System.out.println(isAbundant(19));
    }
}
