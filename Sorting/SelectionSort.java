// package Sorting;

public class SelectionSort {
    public static void sort(int[] list){
        int  n = list.length;
        for(int i=0;i<n;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(list[j]<list[min]){
                    min = j;
                }
            }
            int tmp = list[i];
            list[i] = list[min];
            list[min] = tmp;
        }
    }
    public static void sort(String[] list){
        int  n = list.length;
        for(int i=0;i<n;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(list[j].compareTo(list[min])<0){
                    min = j;
                }
            }
            String tmp = list[i];
            list[i] = list[min];
            list[min] = tmp;
        }
    }
    public static void main(String[] args) {
        String[] list = {"vishal","ram","aman","rahul","ramesh"};
        sort(list);
        for(String i: list){
            System.out.println(i);
        }
    }
}
