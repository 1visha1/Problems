// package 100.Working with numbers;

public class LowestCommonMultiple {
    public static int lcm(int n, int m){
        if(n%m==0)return n;
        
        if(m>n){
            int tmp =n;
            n=m;
            m=tmp;
        }
        int cnt =2;
        while(-1!=0){
            if((n*cnt)%m == 0){
                return n*cnt;
            }
            cnt++;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(lcm(10,12));
    }
}
