// package Sliding windo twopointer;

public class NumberOfSubstringWithContainingAllThreeCharecter {

    public static int count(String s){
        
        int cnt=0;
        for(int i=0;i<s.length();i++){
            int[] hash = {0,0,0};
            for(int j=i;j<s.length();j++){
                hash[s.charAt(j)-'a']=1;
                if(hash[0]+hash[1]+hash[2]==3){
                    cnt++;
                }
      
            }

        }
        return cnt;
    }
    public static int optimal(String s){
        int[] lastSeen = {-1,-1,-1};
        int cnt =0;

        for(int i=0;i<s.length();i++){
            lastSeen[s.charAt(i)-'a']=i;
            cnt += 1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]));
        }
        return cnt;

    }
    public static void main(String[] args) {
        System.out.println(optimal("aabcbaac"));
    }
}
