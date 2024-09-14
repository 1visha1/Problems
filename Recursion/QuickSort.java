public class QuickSort {
    public static void quick(int[] arr, int low, int high){
        if(low<high){
            int part = sort(arr,low,high);
            quick(arr, low, part-1);
            quick(arr, part+1, high);
        }
    }
    public static int sort(int[] arr, int low, int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while (i<high && arr[i]<=pivot ) {
                i++;
            }
            while (j>low && arr[j]> pivot) {
                j--;
            }
            if(i<j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,6,7,5};
        quick(arr, 0, 6);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
