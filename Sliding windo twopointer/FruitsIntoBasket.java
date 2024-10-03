// package Sliding windo twopointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitsIntoBasket {
    public static int brute(int[] arr){
        int maxLen =0;
        for(int i=0;i<arr.length;i++){
            Set<Integer> st = new HashSet<>();
            for(int j=i;j<arr.length;j++){
                st.add(arr[j]);
                if(st.size()<=2){
                    maxLen = Math.max(maxLen,j-i+1);
                }else break;
            }
        }
        return maxLen;
    }
    public static int good(int[] arr, int k){
        int maxLen = 0;
        int l =0;
        int r =0;
        
        Map<Integer,Integer> map = new HashMap<>();
        while(r<arr.length){
            if(!map.containsKey(arr[r])){
                map.put(arr[r],1);
            }else{
                map.put(arr[r],map.get(arr[r])+1);
            }
            if(map.size()>k){
                while(map.size()>k){
                    map.put(arr[l],map.get(arr[l])-1);
                    if(map.get(arr[l])==0){
                        map.remove(arr[l]);
                    }
                    l++;
                }

            }
            if(map.size()<=k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
         return maxLen;
    }
    public static int optimal(int[] arr, int k){
        int maxLen =0;
        int l =0; 
        int r=0;
        Map<Integer, Integer> map = new HashMap<>();
        while (r<arr.length) {
            if(map.containsKey(arr[r])){
                map.put(arr[r],map.get(arr[r])+1);
            }else{
                map.put(arr[r],1);
            }
            if(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
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
        int[] num = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(optimal(num,2));
    }
}
