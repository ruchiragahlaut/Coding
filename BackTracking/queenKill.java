package BackTracking;
import java.util.*;

public class queenKill {

    public static void printQueen(int chess[][],String psf,int r){
        if(r==chess.length){
            System.out.println(psf);
        }

        for(int col =0;col<chess[0].length;col++){
            if(isSafe(chess,r,col)==true){
            chess[r][col] = 1;
            printQueen(chess, psf+r+"-"+col+",", r+1);
            chess[r][col] =0;
            } 
        }
    }
    public static boolean isSafe(int [][]chess,int row,int col){

        // three cases - vertical , right diagonal  , left digonal

        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int chess[][] = new int[n][n];
        printQueen(chess,"",0);
    }
}
