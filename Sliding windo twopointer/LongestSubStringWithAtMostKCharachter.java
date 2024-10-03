// package Sliding windo twopointer;
import java.util.Map;
import java.util.HashMap;
public class LongestSubStringWithAtMostKCharachter {
    public static int subString(String str , int k){
        int maxLen =0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length(); i++){
            map.clear();
            for(int j=i;j<str.length();j++){
                char c =str.charAt(j);
                 if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                 }else{
                    map.put(c,1);
                 }

                 if(map.size()<=k){
                    maxLen= Math.max(maxLen,j-i+1);
                 }
                 else{
                    break;
                 }
            }
        }

        return maxLen;
    }
    public static int better(String str, int k){
        int maxLen =0;
        int l=0;
        int r =0;
        Map<Character, Integer> map = new HashMap<>();
        while (r<str.length()) {
            if(map.containsKey(str.charAt(r))){
                map.put(str.charAt(r),map.get(str.charAt(r))+1);
            }else{
                map.put(str.charAt(r),1);
            }

            while(map.size()>k){
                map.put(str.charAt(l),map.get(str.charAt(l))-1);
                if(map.get(str.charAt(l))==0){
                    map.remove(str.charAt(l));
                }
                l++;
            }

            if(map.size()<=k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
            
        }
        return maxLen;
    }

    public static int optimal(String str, int k){
        int maxLen =0;
        int l=0;
        int r =0;
        Map<Character, Integer> map = new HashMap<>();
        while (r<str.length()) {
            if(map.containsKey(str.charAt(r))){
                map.put(str.charAt(r),map.get(str.charAt(r))+1);
            }else{
                map.put(str.charAt(r),1);
            }

            if(map.size()>k){
                map.put(str.charAt(l),map.get(str.charAt(l))-1);
                if(map.get(str.charAt(l))==0){
                    map.remove(str.charAt(l));
                }
                l++;
            }

            if(map.size()<=k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
            
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        System.out.println(optimal("aaabbbbcabbbcca", 2));
    }
}
