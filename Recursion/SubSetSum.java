import java.util.ArrayList;
import java.util.List;

public class SubSetSum {
    
    public static void subSetSum(int ind, int[] arr, int s, ArrayList<Integer> list){
        if(ind == arr.length){
            list.add(s);
            return ;
        }
        s += arr[ind];
        subSetSum(ind+1, arr, s, list);
        s-= arr[ind];
        subSetSum(ind+1, arr, s, list);
    }
   public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,9,7};
        ArrayList<Integer> list = new ArrayList<>();
        subSetSum(0, arr, 0, list);
        System.out.println(list);
   }
}
