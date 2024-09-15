// package 100;

public class AbundantNumber {
    public static boolean isAbundant(int n){
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                s+=i;
            }
        }
        return s>=n;
    }
    public static void main(String[] args) {
        System.out.println(isAbundant(18));
    }
}
