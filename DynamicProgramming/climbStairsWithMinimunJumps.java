package Code1.DynamicProgramming;
import java.util.*;
public class climbStairsWithMinimunJumps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Integer dp [] = new Integer[n+1];

        dp[n] = 0;
        // try to understand the concept of Integer type dp intilaization
        for(int i=n-1;i>=0;i--){
          if(arr[i]>0){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=arr[i] && i+j<dp.length;j++){
                if(dp[i+j]!=null){
                    min = Math.min(min,dp[i+j]);
                }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i] = min+1;
            }
          }    
        }   
        //for(int i=0;i<n+1;i++){
            System.out.print(dp[0]);
        //}
    }

}
