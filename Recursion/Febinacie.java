// package Recursion;

public class Febinacie {
    public static int frb(int n){
        if(n<=1){
            return 1;
        }
        return frb(n-1)+frb(n-2);
    }
    public static void main(String[] args) {
        
        for(int i=0;i<10;i++){
            System.out.println(frb(i ));
        }
    }
}
