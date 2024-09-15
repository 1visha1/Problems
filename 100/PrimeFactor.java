// package 100;
import java.util.*;
public class PrimeFactor {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primFac(int n, List<Integer> list){
        
        int num =n;
        int cnt =2;
        while(num >=1){
            if(isPrime(cnt)&&num%cnt==0){
                list.add(cnt);
                num/=cnt;
                cnt =2;
                if(num/cnt == 0) return;
            }
            cnt++;
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        primFac(100,list);
        System.out.println(list);
    }
}
