// package 100.starter;

import java.util.Arrays;

public class FibonaciSerise {
    public static int fibo(int n, int arr[]){
        if(n<=0) return 0;
        if(n==1)return 1;
        if(arr[n]!=-1)return arr[n];
        return arr[n]=fibo(n-1,arr)+fibo(n-2,arr);
    }
    
    public static void main(String[] args) {
        int n=10;
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        System.out.println(fibo(n,arr));
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
