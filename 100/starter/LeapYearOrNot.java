// package 100.starter;

public class LeapYearOrNot {
    public static boolean isLeap(int year){
        return year%4==0?(year%100==0?(year%400==0?true:false):true):false;
    }
    public static void main(String[] args) {
        System.out.println(isLeap(2000));
    }
}
