import java.util.*;
public class Suduko {
    public static boolean solve(List<List<Character>> board){
        for(int i=0; i<board.size();i++){
            for(int j=0;j<board.size();j++){
                if(board.get(i).get(j)=='.') {
                    for(char c = '1';c<='9';c++){
                        if(valid(board,i,j,c)){
                            board.get(i).set(j,c);
                            if(solve(board)==true) return true;
                            else board.get(i).set(j,'.');
                        }
                    }
                    return false;
                }

            }
        }
        return true;
    }
    public static boolean valid(List<List<Character>> board, int row,int col, char c){
        for(int i=0;i<9;i++){
            if(board.get(i).get(col)==c)return false;
            if(board.get(row).get(i)==c)return false;
            if(board.get(3*(row/3)+i/3).get(3*(col/3)+i%3)==c)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        List<List<Character>> board = new ArrayList<>();
        
        board.add(Arrays.asList('5', '3', '.', '.', '7', '.', '.', '.', '.'));
        board.add(Arrays.asList('6', '.', '.', '1', '9', '5', '.', '.', '.'));
        board.add(Arrays.asList('.', '9', '8', '.', '.', '.', '.', '6', '.'));
        board.add(Arrays.asList('8', '.', '.', '.', '6', '.', '.', '.', '3'));
        board.add(Arrays.asList('4', '.', '.', '8', '.', '3', '.', '.', '1'));
        board.add(Arrays.asList('7', '.', '.', '.', '2', '.', '.', '.', '6'));
        board.add(Arrays.asList('.', '6', '.', '.', '.', '.', '2', '8', '.'));
        board.add(Arrays.asList('.', '.', '.', '4', '1', '9', '.', '.', '5'));
        board.add(Arrays.asList('.', '.', '.', '.', '8', '.', '.', '7', '9'));
        solve(board);
        System.out.println(board);
       
        
    }
}
