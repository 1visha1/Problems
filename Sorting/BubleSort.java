public class BubleSort{
    public static void sort(int[] list){
        boolean flg = true;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length-i-1;j++){
                if(list[j]>list[j+1]){
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1]= tmp;
                    flg = false;
                }
            }
            if(flg){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] list = {36,19,29,12,5};
        sort(list);
        for(int i: list){
            System.out.println(i);
        }
    }
}