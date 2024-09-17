// package 100.Working with numbers;
import java.util.*;
public class HighestCommonFactor {
    public static int hcf(int n, int m){
        int hiest = 1;
        for(int i=2;i<=n;i++){
            if(n%i==0 && m%i==0)hiest = i;
        }
        return hiest;
    }
    
    public static void main(String[] args) {
        System.out.println(hcf(4, 12));
    }
}
