import java.util.*;
public class LongestSubArrayWithKsum {

    public static int brut(int[] nums, int k){
        int len =0;

        for(int i=0;i<nums.length;i++){
            int s =0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                // for(int m =i;m<=j;m++){
                //     s+= nums[m];
                // }
                
                if(s==k){
                    len = Math.max(len, j-1+1);
                }
            }
        }
        return len;
    }

    public static int better(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int len =Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(sum == k){
                len = Math.max(len, i+1);

            }
            int rem =sum -k;
            if(map.get(rem)!=map.get(i)){
                int len1 = map.get(rem);
                len = Math.max(len,len1);
            }


        
        }
        return len;
    }
    public static int optiml(int[] nums,int k){
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int cum_sum = 0;
        int max_len = 0;

        for (int i = 0; i < n; i++) {
            cum_sum += nums[i];

            if (cum_sum == k) {
                max_len = i + 1;
            }

            if (sumMap.containsKey(cum_sum - k)) {
                max_len = Math.max(max_len, i - sumMap.get(cum_sum - k));
            }

            if (!sumMap.containsKey(cum_sum)) {
                sumMap.put(cum_sum, i);
            }
        }

        return max_len;
    }
    public static void main(String[] args){

        int[] arr = {10, 5, 2, 7, 1, 9};
    
        System.out.println(optiml(arr, 15));
    }
    
}

