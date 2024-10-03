// package Sliding windo twopointer;

public class LongestRepeatingCharachter {

    public static int repeatingChar(String s, int k){
        int maxLen =0;
        for(int i=0;i<s.length();i++){
            int[] hash = new int[26];
            int maxf =0;
            for(int j=i;j<s.length();j++){
                hash[s.charAt(j) -'A'] ++;
                maxf = Math.max(maxf,hash[s.charAt(i)-'A']);
                int chang = (j-i+1)-maxf;
                if(chang<=k){
                    maxLen = Math.max(maxLen,j-i+1);
                }else{
                    break;
                }
            }
            

        }
        return maxLen;
    }
    public static int better(String s, int k){
        int l=0;
        int r=0;
        int maxLen = 0;
        int maxf=0;
        int[] hash = new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxf = Math.max(maxf,hash[s.charAt(r)-'A']);
            if(((r-l+1)-maxf)>k){
                hash[s.charAt(l)-'A']--;
                maxf = 0;
                for(int i=0;i<16;i++){
                    maxf = Math.max(maxf,hash[i]);
                }
                l++;
            }
            if(((r-l+1)-maxf)<=k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }

    public static int optimal(String s, int k){
        int l=0;
        int r=0;
        int maxLen = 0;
        int maxf=0;
        int[] hash = new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxf = Math.max(maxf,hash[s.charAt(r)-'A']);
            if(((r-l+1)-maxf)>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if(((r-l+1)-maxf)<=k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(optimal("AABABBA",2));
    }
    
}
