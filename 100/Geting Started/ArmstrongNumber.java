// package 100;

public class ArmstrongNumber {
    public static boolean isArmstrog(int n){
          int num = n;
          int len = 0;
          while(num!=0){
            len++;
            num/=10;
          } 
          num = n;
          int rem=0;
          int st=0;
          while(num!=0){
            rem = num%10;
            num /=10;
            int tmp=1;
            for(int i=0;i<len;i++){
                tmp*=rem;
            }
            st+=tmp;
          }
          System.out.println(st);
          if(st == n){
            return true;
          }
          return false;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrog(1));
    }
}
