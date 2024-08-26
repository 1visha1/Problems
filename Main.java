public class Main {
    public static int longestSubArrayWithSumK(int[] nums, int k){
        int len =0;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int s =0;
                for(int m =i;m<=j;m++){
                    s+= nums[m];
                }
                if(s==k){
                    len = Math.max(len, j-1+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args){

        int[] arr = {10, 5, 2, 7, 1, 9};
    
        System.out.println(longestSubArrayWithSumK(arr, 15));
       } 
    }

