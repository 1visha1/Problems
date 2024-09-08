import java.util.ArrayList;

public class MeregeSort {
    public static void merge(int[] arr, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            merge(arr, low, mid);
            merge(arr, mid+1, high);
            sort(arr, low,mid, high);
        }
    }
    public static void sort(int[] arr, int low, int mid,int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> list = new ArrayList<>();
        while(left<=mid &&right <=high){
            if(arr[left]<arr[right]){
                list.add(arr[left++]);
            }else{
                list.add(arr[right++]);
            }
        }
        left = low;
        for(int i:list){
            arr[left++]=i;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,4,8,4,2,5,7};
        merge(arr, 0, 7);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
