// package 100.starter;

public class HarshNumber {
    public static boolean isHarsh(int n){
        int tmp =n;
        int s =0;
        while(tmp !=0){
            
            s+=tmp%10;
            tmp/=10;
        }

        return n%s==0;
    }
    public static void main(String[] args) {
        System.out.println(isHarsh(12));
    }
}
