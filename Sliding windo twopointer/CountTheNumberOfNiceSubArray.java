
import java.util.*;
public class CountTheNumberOfNiceSubArray {

    public static int  nice(int[] arr, int k){
        int cnt =0;
        for(int i=0;i<arr.length;i++){
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<arr.length;j++){
                if(map.containsKey(arr[j])){
                    map.put(arr[j],map.get(arr[j])+1);
                }else{
                    map.put(arr[j],1);
                }
                if(map.size()==k) cnt++;
                else break;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,3,4,3,2};
        System.out.println(nice(arr, 3));
    }
}
