// package 100.starter;

public class AutomorphicNumber {
    
    public static int count(int n){
        int cnt =0;
        while(n!=0){
            n/=10;
            cnt++;
        }
        return cnt;
    }

    public static boolean isAutomorphic(int n){
        int cnt = count(n);

        int sqr = (int)Math.pow(n,2);
        int s=0;
        while(cnt !=0){
            cnt--;
            s += sqr%10;
            sqr/=10;
        }
        sqr = 0;
        while(s!=0){
            sqr+=s%10;
            s/=10;
        }
        return sqr == n;

    }
    public static void main(String[] args) {
        System.out.println(isAutomorphic(3));
    }
}
