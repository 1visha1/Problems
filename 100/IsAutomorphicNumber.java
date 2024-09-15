// package 100;

public class IsAutomorphicNumber {
    public static int len(int n){
        int cnt=0;
        while(n!=0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public static boolean isAutom(int n){
        int len = len(n);
        int cnt =0;
        int sqr = n*n;
        while(cnt < len){
            if(n%10 != sqr %10){
                return false;
            }
            n/=10;
            sqr/=10;
            cnt++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAutom(79));
    }
}
