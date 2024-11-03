// package 100.starter;

public class GretestOfThree {
    public static int gretest(int a, int b, int c){
        return a>b?(a>c?a:b):(b>c?b:c);
    }
    public static void main(String[] args) {
        System.out.println(gretest(1,2, 3));
    }
}
