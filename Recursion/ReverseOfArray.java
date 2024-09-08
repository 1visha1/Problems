// package Recursion;
    
public class ReverseOfArray {
    public static void rev(int[] arr,int i, int n){
        if(i<= n-1-i){
            int tmp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = tmp;
            rev(arr, i+1,n );
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        rev(arr, 0, n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
