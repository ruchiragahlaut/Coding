package RecursionInArrays;
import java.util.*;

public class lastIndex {


    public static int last(int[] arr, int idx, int x) {
        if(idx ==arr.length){
            return -1;
        }
        int ans = last(arr,idx+1,x);
        if(ans==-1){
             if(arr[idx]==x){
            ans = idx;
            }
        }       
        return ans;
        
      
    }


    public static void main(String[] args) {

            
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        
        System.out.println(last(arr,0,x));
    }

        
}

