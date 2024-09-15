// package 100;

public class ArmStrongNumverUpToN {
    public static boolean isArmstrong(int n) {
        int num = n;
        int len = 0;
        
        // Calculate the number of digits in the number
        while (num != 0) {
            len++;
            num /= 10;
        }
        
        num = n;
        int rem = 0;
        int sum = 0;
        
        // Calculate the Armstrong number
        while (num != 0) {
            rem = num % 10;
            num /= 10;
            
            int tmp = 1;
            for (int i = 0; i < len; i++) {
                tmp *= rem;
            }
            
            sum += tmp;
        }
        
        // Return whether the number is an Armstrong number
        return sum == n;
    }
  
    public static void main(String[] args) {
        int n=1000;
        for(int k=1;k<n;k++){
            if(isArmstrong(k)){
                System.out.println(k);
            }
        }
    }
}
