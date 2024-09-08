// package Recursion;
    
public class StringPalindrom {
    public static boolean check(String str, int i, int n){
        if(i<= n-i-1){
            if(str.charAt(i)==str.charAt(n-i-1)){
                check(str, i+1, n);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(check("abb", 0, 3));
    }
    
}
