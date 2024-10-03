// package Sliding windo twopointer;

import java.util.HashMap;

public class LongestSubstringWithAtMostKDistinctCharachter {
    public static int brute(String str,int k){
        int maxLen =0;
        for(int i=0;i<str.length();i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i;j<str.length();j++){
                if(map.containsKey(str.charAt(j))){
                    map.put(str.charAt(j),map.get(str.charAt(j))+1);
                }else{
                    map.put(str.charAt(j),1);
                }
                if(map.size()<=k){
                    maxLen = Math.max(maxLen,j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }

    public static int better(String str, int k){
        int maxLen =0;
        int l=0;
        int r=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<str.length()){
            if(map.containsKey(str.charAt(r))) map.put(str.charAt(r),map.get(str.charAt(r))+1);
            else map.put(str.charAt(r),1);
            
            while(map.size()>k){
                map.put(str.charAt(l) ,map.get(str.charAt(l))-1);
                if(map.get(str.charAt(l))==0) map.remove(str.charAt(l));
                l++;
            }
            if(map.size()<=k) maxLen = Math.max(maxLen, r-l+1);

            r++;
        }
        return maxLen;


    }
    public static int optimal(String str, int k){
        int maxLen =0;
        int l=0;
        int r=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<str.length()){
            if(map.containsKey(str.charAt(r))) map.put(str.charAt(r),map.get(str.charAt(r))+1);
            else map.put(str.charAt(r),1);
            
            if(map.size()>k){
                map.put(str.charAt(l) ,map.get(str.charAt(l))-1);
                if(map.get(str.charAt(l))==0) map.remove(str.charAt(l));
                l++;
            }
            if(map.size()<=k) maxLen = Math.max(maxLen, r-l+1);

            r++;
        }
        return maxLen;


    }
    public static void main(String[] args) {
        String str ="aaabbccd";
        System.out.println(better(str, 2));
    }
}
