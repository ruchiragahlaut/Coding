package RecursionInArrayList;

import java.util.ArrayList;
import java.util.*;
public class getMazePathsWithJumps {

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr==dr && sc==dc){
            ArrayList <String> ss = new ArrayList<>();
            ss.add("");
            return ss;
        }

        ArrayList <String> finalre = new ArrayList<>();

        for(int i=1;i<=dc-sc;i++){
            ArrayList <String> hp = getMazePaths(sr, sc+i, dr, dc);
            for(String s : hp){
                finalre.add("h"+i+s);
            }
        }

        for(int i=1;i<=dr-sr;i++){
            ArrayList <String> vp = getMazePaths(sr+i, sc, dr, dc);
            for(String s : vp){
                finalre.add("v"+i+s);
            }
        }

        for(int i=1;i<=dc-sc && i<=dr-sr;i++){
            ArrayList <String> dp = getMazePaths(sr+i, sc+i, dr, dc);
            for(String s : dp){
                finalre.add("d"+i+s);
            }
        }

        return finalre;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList <String> ss = getMazePaths(1,1,n,m);
        System.out.println(ss);
    }
}
