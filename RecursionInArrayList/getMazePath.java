package Code1.RecursionInArrayList;
import java.util.*;


public class getMazePath {

   
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        ArrayList <String> hpaths = new ArrayList<>();
        ArrayList <String> vpaths = new ArrayList<>();
        
        
        
        if(sc==dc && sr==dr){
            ArrayList <String> ss = new ArrayList<>();
            ss.add("");
            return ss;
        }

            if(sc<dc){
                hpaths = getMazePaths(sr, sc+1, dr, dc);
            }
            if(sr<dr){
                vpaths = getMazePaths(sr+1, sc, dr, dc);
            }

            ArrayList <String> result = new ArrayList<>();
            for(String hp : hpaths){
                result.add("h"+hp);
            }

            for(String vp : vpaths){
                result.add("v"+vp);
            }
            
            return result;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList <String> ss = getMazePaths(1,1,n,m);
        System.out.println(ss);

    }
}
