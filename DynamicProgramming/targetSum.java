package Code1.DynamicProgramming;
import java.util.*;
public class targetSum {

    public static void main(String[] args) {
      /*   Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n+1];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        int dp [][] = new int[n+1][tar+1];
        
        for(int i=0;i<n+1;i++){
            dp[i][0] =1;
        }

        System.out.println(dp[0][0]);

        for(int i=1;i<=n;i++){
            for(int j=1;j<=tar;j++){
                if(j>=arr[i-1]){
                    int sup = j-arr[i-1];
                    if(dp[i][sup]==1){
                        dp[i][j] = 1;
                    }
                }
                if(dp[i-1][j]==1){
                    dp[i][j]=1;
                }
            }
        }
        System.out.print(dp[n][tar]);
         */

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int tar = sc.nextInt();
        
        boolean dp [][] = new boolean[n+1][tar+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                
                if(i==0 && j==0){
                    dp[i][j] = true;
                }
                else if(i==0){
                    dp[i][j] = false;
                }
                else if(j==0){
                    dp[i][j]=true;
                }
                else{
                    
                    if(dp[i-1][j]==true){
                        dp[i][j] = true;
                    }
                    else{
                        int val = arr[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val]==true){
                                dp[i][j]=true;
                            }
                        }
                    }
                    
                }
                
                
            }
        }
        
        System.out.println(dp[arr.length][tar]);
    }
    
}
