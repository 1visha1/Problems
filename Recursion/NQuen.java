import java.util.*;
public class NQuen {
    public static void solve(char[][] arr, int col, boolean[] row, boolean[] lowDig, boolean[] upDig){
        if(col== arr.length){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            // System.out.println(arr);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!row[i] &&!lowDig[i+col]&& !upDig[arr.length-1 + col-i]){
                row[i]=true;
                lowDig[i+col]= true;
                upDig[arr.length-1 + col-i] = true;
                arr[col][i] = 'q';
                solve(arr, col+1, row,lowDig,upDig);
                arr[col][i] = '\u0000';
                row[i] = false;
                upDig[arr.length-1 + col-i]=false;
                lowDig[i+col] = false;

            }
        }

    }
    public static void main(String[] args) {
        char[][] arr = new char[4][4];
        boolean[] row = new boolean[4];
        boolean[] lowDIg = new boolean[8];
        boolean[] upDig= new boolean[8];
        solve(arr, 0, row, lowDIg, upDig);
    }
}
