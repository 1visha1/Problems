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
    public static void main(String[] args){

        int[] arr = {10, 5, 2, 7, 1, 9};
    
        System.out.println(brut(arr, 15));
    }
    
}

