// package 100.starter;


public class SumOfNumbersGivnInRange {
    public static int sum(int a, int b){
        return (b*(b+1)/2)- (a*(a+1)/2);
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 5));
    }
}
