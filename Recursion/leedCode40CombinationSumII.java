import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leedCode40CombinationSumII {
    public static void cb(int[] arr, int i, int t, List<Integer> ds, List<List<Integer>> ans){
        if(t == 0){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1]) continue;
            if(arr[j]>t){
                break;
            }

           
            ds.add(arr[j]);
            cb(arr, j+1, t-arr[j], ds, ans);
            ds.remove(ds.size()-1);
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        cb(arr, 0, 4, ds, list);
        System.out.println(list);
    }
}
