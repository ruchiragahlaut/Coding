package Code1.RecursionOnWayUp;
import java.util.*;

public class printMazePathsWithJumps {

    public static void jumpsPaths(int sc,int sr,int dc,int dr,String psf){

        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }


        for(int i=1;i<=dc-sc;i++){
            jumpsPaths(sc+i, sr, dc, dr, psf+"h"+i);
        }
        for(int i=1;i<=dr-sr;i++){
            jumpsPaths(sc, sr+i, dc, dr, psf+"v"+i);
        }

        for(int i=1;i<=dr-sr && i<sr-sc;i++){
            jumpsPaths(sc+i, sr+i, dc, dr, psf+"d"+i);
        }

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

          
        jumpsPaths(1,1,n,m,"");



    }
    
}
