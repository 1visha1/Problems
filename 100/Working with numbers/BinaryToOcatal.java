public class BinaryToOcatal {

    public static StringBuilder binToOct(String str){
        StringBuilder str2 = new StringBuilder();
        int len = str.length();
        int cnt =0;
        int i=1;
        int s=0;
        while(len-1>-1){
            if(cnt >4){
                cnt =1;
                str2.insert(0, s);
                s=0;
            }
            
            if(str.charAt(len-i)=='1'){
                s+=1*cnt;
            }
            cnt*=2;
            i++;

        }
        return str2;
    }
    public static void main(String[] args) {
        System.out.println(binToOct("101"));
    }
}
