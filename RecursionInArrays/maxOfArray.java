package RecursionInArrays;
import java.util.*;

public class maxOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxn = Integer.MIN_VALUE;
        MaxArr(arr,maxn,0);
    }

    public static void MaxArr(int[] arr,int maxn, int idx){
        
        if(idx==arr.length){
            System.out.println(maxn);
            return;
        }
        if(arr[idx]>maxn){
            maxn =arr[idx];
        }
        MaxArr(arr,maxn,idx+1);
    }

}
