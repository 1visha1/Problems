import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leedCode40CombinationSumII {
    public static void cb(int ind, int[] arr, int tr, List<Integer> ds, List<List<Integer>> ans){
        if(tr == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind; i<arr.length;i++){
            if(arr[i]>tr){
                break;
            }
            if(i>ind && arr[i]==arr[i-1])continue;
             
            
            ds.add(arr[i]);
            cb(i+1, arr, tr-arr[i], ds, ans);
            ds.remove(ds.size()-1);
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(arr);
        cb(0, arr, 4, ds, ans);
        System.out.println(ans);
    }
}
