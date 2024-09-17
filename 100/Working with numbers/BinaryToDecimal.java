// package 100.Working with numbers;

public class BinaryToDecimal {
    public static int decimal(int n){
        int num = 0;
        int cnt = 1;
        while(n!=0){
            if(n%10 == 1) num+=cnt;
            n/=10;
            cnt*=2;
        }
        return num;
    }
    public static int decimal(String n){
        int len =n.length();
        int num =0;
        int cnt=1;
        int i=1;
        while(len-i >-1){
            if(n.charAt(len-i)=='1')num+=cnt;
            i++;
            cnt*=2;
            
        }
        return num;

    }
    public static void main(String[] args) {
        System.out.println(decimal("1001"));
    }

}
