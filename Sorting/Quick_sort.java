// package Sorting;

public class Quick_sort {
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int part = fun(arr, low, high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
    }
    public static int fun(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while (i<=high&&arr[i]<=pivot ) {
                i++;
            }
            while (j>=low&&arr[j]>pivot  ) {
                j--;

            }
            if(i<j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] list = {9,8,7,6,6,5,4,3,2,1};
        quickSort(list, 0, 9);
        for(int i: list){
            System.out.print(i);
        }
    }
}
