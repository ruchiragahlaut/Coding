package BackTracking;
import java.util.*;
public class knightTour {


    public static void displayBoard(int chess[][]){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
    public static void chess(int chess[][] ,int r ,int c,int move){

        if( r<0 || c<0|| r>=chess.length || c>=chess[0].length || chess[r][c]>0){
            return;
        }
        if(move==chess.length*chess.length){
            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] =0;
        }
        chess[r][c] = move;

        chess(chess,r-2,c+1,move+1);
        chess(chess,r-1,c+2,move+1);
        chess(chess,r+1,c+2,move+1);
        chess(chess,r+2,c+1,move+1);

        chess(chess,r+2,c-1,move+1);
        chess(chess,r+1,c-2,move+1);
        chess(chess,r-1,c-2,move+1);
        chess(chess,r-2,c-1,move+1);

        chess[r][c]  =0;



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int chess[][] = new int[n][n];
       
        chess(chess,r,c,1);



    }

}
