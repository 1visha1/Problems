// package 100.starter;

public class AramStrongNumber {
    public static int countDigit(int n){
        int cnt =0;
        while(n!=0){
            n/=10;
            cnt++;
        }
        return cnt;
    }

    public static boolean isArmstring(int n){
        int cnt = countDigit(n);
        int arm = 0;
        int tmp = n;
        while(tmp != 0){
            arm+=Math.pow(tmp%10,cnt);
            tmp /=10;
        }


        return arm == n;

    }
    public static void main(String[] args) {
        System.out.println(isArmstring(371));
    }
}
