public class teast {
    public static int findMaxSubsequnce(String s){
        int[] arr = new int[256];
        int maxLen =0;
        int len =0;
        int r=0;
        int l =0;
        int n =s.length();
        while (r<n) {
            if (arr[s.charAt(r)]!= 0) {
                if(arr[s.charAt(r)]>=l){
                    l = arr[s.charAt(r)]+1;
                }

            }
            len = r-l+1;
            maxLen = Math.max(len, maxLen);
            arr[s.charAt(r)]=r;
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(findMaxSubsequnce("abcdefafgh"));
    }
}
