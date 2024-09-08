// package Recursion;

import java.util.ArrayList;

public class SubSequncing {
    public static void sub(int[] arr,ArrayList<Integer> list, int i,int n){
        if(i>=n){
            print(list);
            return;
        }
        list.add(arr[i]);
        sub(arr, list, i+1, n);
        list.remove(list.size()-1);
        sub(arr, list, i+1, n);

    }
    public static void print(ArrayList<Integer> list){
        for(int i:list){
            System.out.print(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        sub(arr,list,0,3);
    }
}
