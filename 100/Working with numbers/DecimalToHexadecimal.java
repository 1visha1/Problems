import java.util.*;;
public class DecimalToHexadecimal {
    static HashMap<Integer, Character> map = new HashMap<>();
    public static void map(){
        map.put(0,'0');
        map.put(1,'1');
        map.put(2,'2');
        map.put(3,'3');
        map.put(4,'4');
        map.put(5,'5');
        map.put(6,'6');
        map.put(7,'7');
        map.put(8,'8');
        map.put(9,'9');
        map.put(10,'A');
        map.put(11,'B');
        map.put(12,'C');
        map.put(13,'D');
        map.put(14,'E');
        map.put(15,'F');

    }
    public static StringBuilder decToHex(int n){
        StringBuilder str = new StringBuilder();
        while(n!=0){
            str.insert(0, map.get(n%16));

            n/=16;
        }
        return str;
    }
    public static void main(String[] args) {
        map();
        System.out.println(decToHex(15));
    }
}
