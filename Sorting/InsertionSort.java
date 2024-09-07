// package Sorting;

public class InsertionSort {
    public static void sort(int[] list){
        int n = list.length;
        for(int i=1;i<n;i++){
            int tmp = list[i];
            int j=i;
            while(j>0 &&list[i-1]>tmp){
                list[j] = list[j-1];
                j = j-1;
            }
            list[j] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] list = {36,19,29,12,5};
        sort(list);
        for(int i: list){
            System.out.println(i);
        }
    }
}
