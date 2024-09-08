// package Recursion;

import java.util.ArrayList;

public class SubSequnceEqulToK {
    public static boolean sub(int[] arr, ArrayList<Integer> list, int i,int n, int sum, int s){

        if(i>=n){
            if(sum == s){
                print(list);
                return true;
            }
            return false;
        }
        
        list.add(arr[i]);
        s+= arr[i];
        
        if(sub(arr, list, i+1, n, sum, s))return true;
        list.remove(list.size()-1);
        s-=arr[i];

        if(sub(arr, list, i+1,n,sum,s))return true;
        return false;
    }
    
    public static void print(ArrayList<Integer> list){
        for(int i: list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>();
        sub(arr, list, 0, 4, 4, 0);
    }
}
