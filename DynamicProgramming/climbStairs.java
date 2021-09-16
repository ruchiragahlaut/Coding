package Code1.DynamicProgramming;
import java.util.*;

public class climbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n+1];
        arr[0] =1;
        for(int i=1;i<n+1;i++){
            
            if(i==1){
                arr[i] = arr[i-1];
            }
            else if(i==2){
                arr[i] = arr[i-2]+arr[i-1];
            }
            else{
                arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
            }
        }

        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+",");
        }
    }
}
