// package 100;

public class LeapYear {
    public static boolean isLeap1(int year){
        if(year%400==0){
            return true;
        }else{
            if(year%100 != 0 && year%4 == 0){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isLeap1(1900));
    }
}
