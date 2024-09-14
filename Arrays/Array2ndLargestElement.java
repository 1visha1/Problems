// package Arrays;


public class Array2ndLargestElement {
    public static int lrg(int[] arr){
        int l = arr[0];
        int sl = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(l<arr[i]){
                sl = l;
                l=arr[i];
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,1,8,0,5,2,3};
        System.out.println(lrg(arr));
    }
}
