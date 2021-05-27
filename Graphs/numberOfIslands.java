package Graphs;
import java.io.*;
import java.util.*;

/* 
1. You are given a 2d array where 0's represent land and 1's represent water. 
     Assume every cell is linked to it's north, east, west and south cell.
2. You are required to find and count the number of islands. */


public class numberOfIslands {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      // write your code here
      boolean[][] visited = new boolean[m][n];
      int count =0;
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(arr[i][j]==0 && visited[i][j]==false){
                istrue(arr,i,j,visited);
                count++;
              }  
          }
      }
      
      System.out.println(count);
      
      
   }
   
   public static void istrue(int [][] arr,int r,int c,boolean[][]visited){
       
       if(r<0 || c<0 || r>=arr.length || c>=arr[0].length || arr[r][c]==1 || visited[r][c]==true){
           return;
       }
       
       visited[r][c] = true;
       istrue(arr,r-1,c,visited);
        istrue(arr,r,c-1,visited);
          istrue(arr,r+1,c,visited);
           istrue(arr,r,c+1,visited);
   }

}