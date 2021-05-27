package RecursionOnWayUp;
import java.io.*;
import java.util.*;

public class printStairPath {

    public static void main(String[] args) throws Exception {
        
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        printstairPaths(n,s);

    }

    public static void printstairPaths(int n, String path) {
        
        if(n==0){
            System.out.println(path);
            return;
        }

        if(n<0){
            return;
        }
        
        printstairPaths(n-1,path+"1");
         printstairPaths(n-2,path+"2");
          printstairPaths(n-3,path+"3");
        
        
    }
    

}