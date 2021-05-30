package RecursionInArrayList;

/**
 * getStairs
 * 
 * input - 3
 * 1. You are given a number n representing number of stairs in a staircase.
 * 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
 * 
 */
import java.util.*;
public class getStairs {


    public static ArrayList<String> getStairPaths(int n ){

        if(n<0){
            ArrayList<String> rr = new ArrayList<>();
            return rr;
        }
        if(n==0){
            ArrayList<String>  rr = new ArrayList<>();
            rr.add("");
            return rr;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String p : path1){
            paths.add(1+p);
        }
       
          for(String p : path2){
            paths.add(2+p);
        }
       
          for(String p : path3){
            paths.add(3+p);
        }
       
       return paths;

    }
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      ArrayList<String> path = getStairPaths(n);
      System.out.println(path);

  }



    
}