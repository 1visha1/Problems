import java.util.*;

public class ArraySetSumII {
    public static void fs(int ind, int[] arr, List<Integer> ds, Set<List<Integer>> list){
        list.add(new ArrayList<Integer>(ds));
        for(int i=ind; i<arr.length; i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            fs(ind+1, arr, ds, list);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        List<Integer> ds = new ArrayList<>();
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(arr);
        fs(0, arr, ds, list);
        System.out.println(list);
    }
}
