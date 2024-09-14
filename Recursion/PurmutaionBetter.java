import java.util.*;
public class PurmutaionBetter {
    public static void per(int ind, int[] arr, List<List<Integer>> ans){
        if(ind == arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            swap(arr, ind, i);
            per(ind+1, arr, ans);
            swap(arr, ind, i);
        }

    }
    public static void swap(int[] arr, int ind, int i){
        int tmp =arr[ind];
        arr[ind] = arr[i];
        arr[i] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        per(0, arr, ans);
        System.out.println(ans);

    }
}
