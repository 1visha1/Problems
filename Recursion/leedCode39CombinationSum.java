import java.util.ArrayList;

public class leedCode39CombinationSum {
    public static void fc(int i, int[] arr, int t, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ds){
        if(i>= arr.length){
            if(t == 0)list.add(new ArrayList<Integer>(ds));
            return;
        }
        if(arr[i]<= t){
            ds.add(arr[i]);
            fc(i, arr, t-arr[i], list, ds);
            ds.remove(ds.size()-1);
        }
        fc(i+1, arr, t, list, ds);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        fc(0, arr, 3, list, ds);
        System.out.println(list);
    }
}
