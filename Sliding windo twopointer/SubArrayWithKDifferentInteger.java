import java.util.*;;
public class SubArrayWithKDifferentInteger {

    public static int subArray(int[] nums, int k){
        if(k<0) return 0;
        int l=0;
        int r=0;
        int cnt = 0;
        Map<Integer,Integer> map =new HashMap<>();
        while(r<nums.length){
            if(map.containsKey(nums[r])){
                map.put(nums[r],map.get(nums[r])+1);
            }
            else{
                map.put(nums[r],1);
            }
            while (map.size()>k) {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;

    }
    public static int sumOfSubArray(int[] nums, int k){
        return subArray(nums, k)-subArray(nums, k-1);
    }
    public static void main(String[] args) {
        int[] nums={2,1,1,1,3,4,3,1};
        System.out.println(sumOfSubArray(nums, 3));
    }
}
