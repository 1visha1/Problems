// package 100.starter;

import java.util.List;
import java.util.ArrayList;

public class AramStrongNumberRange {
    public static int count(int n){
        int cnt=0;
        while(n!=0){
            n/=10;
            cnt++;

        }
        return cnt;
    }

    public static boolean isArmstrong(int n){
        int cnt = count(n);
        int tmp = n;
        int arm = 0;
        while(tmp != 0){
            arm += Math.pow(tmp%10, cnt);
            tmp/=10;
        }
        return arm == n;
    }

    public static List<Integer> range(int a, int b){
        List<Integer> list = new ArrayList<>();
        for(a=a;a<=b;a++){
            if(isArmstrong(a))list.add(a);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(range(1, 0100000));
    }
}
