import java.util.*;
public class Purmutation {
    public static void per(int ind, int[] arr, List<List<Integer>> ans, List<Integer> ds, boolean[] map){
        if(ind == arr.length){
            ans.add(new ArrayList<>(ds));
            return;

        }
        for(int i=0;i<arr.length;i++){
            if(!map[i]){
                map[i]=true;
                ds.add(arr[i]);
                per(ind+1, arr, ans, ds, map);
                ds.remove(ds.size()-1);
                map[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        boolean[] map =new boolean[arr.length];
        List<List<Integer>> asn = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        per(0, arr, asn, ds, map);
        System.out.println(asn);


    }
}
