public class BinarySubArrayWithSum {

    public static int sumArray(int[] nums, int gaol){
        if(gaol<0) return 0;
        int l=0;
        int r=0;
        int sum =0;
        int cnt =0;
        while(r<nums.length){
            sum += nums[r];
            while(sum>gaol){
                sum = sum - nums[l];
                l++;
            }
            cnt = cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
    public static int sumOfSubArray(int[] nums, int gaol){
        return sumArray(nums, gaol)-sumArray(nums, gaol-1);
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,0,1,0,1};
        System.out.println(sumOfSubArray(nums, 2));
    }
}
