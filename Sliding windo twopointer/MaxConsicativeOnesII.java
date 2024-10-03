// package Sliding windo twopointer;

public class MaxConsicativeOnesII {
    public static int longestSubArrayWithKzero(int[] arr, int k){
        int maxLen =0;
        maxLen =0;
        for(int i=0;i<arr.length;i++){
            int zero =0;
            int len = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0) zero ++;
                if(zero <=k){
                    len = j-i+1;
                    maxLen = Math.max(maxLen, len);
                }else break;
                
            }
        }

        return maxLen;
    }
    public static int good(int[] arr, int k){

        int maxlen =0;
        int l =0;
        int r =0;
        int zero =0;

        while(r<arr.length){
            if(arr[r]==0)zero++;
            while(zero>k ){
                if(arr[l]==0)zero--;
                l++;

            }
            if(zero<=k){
                int len = r-l+1;
                maxlen = Math.max(maxlen, len);

            }
            r++;
        }
        return maxlen;
    }
    public static int optimal(int[] arr, int k){
        int l=0;
        int r=0;
        int zero =0;
        int maxLen =0;
        while (r<arr.length) {
            if(arr[r] == 0) zero ++;
            if(zero >k){
                if(arr[l] == 0)zero --;
                l++;
            }
            if(zero<=k){
                int len = r-l+1;
                maxLen = Math.max(len,maxLen);
            }
            r++;
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,1,0,0,0,0,1,1,1,1,0};
        System.out.println(optimal(arr, 2));
    }
}
