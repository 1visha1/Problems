// package 100.Working with numbers;

import java.util.HashMap;

public class HexadecimalToDecimal {
    static HashMap<Character, Integer> map = new HashMap<>();

    public static int hexToDec(String n){
        int num =0;
        int len = n.length();
        int i=1;
        int cnt =1;
        while(len-i>-1){
            num +=(map.get(n.charAt(len-i)))*cnt;
            i++;
            cnt*=16;

        }
        return num;
    }
    public static void putMap(){
        map.put('0',0);
        map.put('1',1);
        map.put('2',2);
        map.put('3',3);
        map.put('4',4);
        map.put('5',5);
        map.put('6',6);
        map.put('7',7);
        map.put('8',8);
        map.put('9',9);
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
    }
    public static void main(String[] args) {
        putMap();
        System.out.println(hexToDec("C9"));
    }
}
