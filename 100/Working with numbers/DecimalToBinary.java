public class DecimalToBinary {
    public static int decToBin(int n){
        StringBuilder str = new StringBuilder();
        while(n!=0){
            str.insert(0, n%2);

            n/=2;
        }
        return Integer.parseInt(str.toString());
    }
    public static void main(String[] args) {
        System.out.println(decToBin(999));
    }
}
