// package Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void mergerSort(int[] arr, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            mergerSort(arr, low, mid);
            mergerSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
        // return arr;
    }
    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;

            }else{
                list.add(arr[right]);
                right++;
            }

        }
        while (left<=mid){
            list.add(arr[left]);
            left ++;
        } 
        while (right<=high){
            list.add(arr[right]);
            right ++;
        } 
        int i = low;
        for(int j:list){
            arr[i++]=j;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,7,5,4,6,9,0};
        mergerSort(arr, 0, 8);
        for(int i: arr){
            System.out.print(i);
        }
    }
}
