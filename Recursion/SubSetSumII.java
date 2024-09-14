import java.util.*;;
public class SubSetSumII {
    public static void subSet(int ind, int[] arr, HashSet<List<Integer>> ans, List<Integer> ds){
        // if(ind == arr.length){
            ans.add(new ArrayList<>(ds));
           
        // }
        for(int i= ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            subSet(i+1, arr, ans, ds);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        HashSet<List<Integer>> ans  = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        subSet(0, arr, ans, ds);
        System.out.println(ans);
    }
}
