import java.util.ArrayList;
import java.util.List;

public class SubSetSum {
    public static void subset(int i,int s ,int[] arr,List<Integer> list ){
        if(i==arr.length){
            list.add(s);
            return ;
        }
        subset(i+1, s+arr[i], arr, list);
        subset(i+1, s, arr, list);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {1,2,3,4,5};
        subset(0, 0, arr, list);
        System.out.println(list);
    }
}
