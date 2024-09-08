// package Recursion;

public class ContOfSubSecunce {
    
    public static int sub(int[] arr, int i, int n,int s,int sum){
        if(i>=n){
            if(sum==s){
                return 1;
            }
            return 0;
        }
        s+= arr[i];
        int r =sub(arr, i+1, n,s,sum);
        s-=arr[i];
        int l =sub(arr,i+1,n,s,sum);
        return r+l;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(sub(arr, 0, 4,0,4));
    }
}
