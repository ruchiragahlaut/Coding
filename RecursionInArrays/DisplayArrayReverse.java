package RecursionInArrays;
import java.util.*;

public class DisplayArrayReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        
        if(idx==arr.length){
            return;
        }
        else{
            displayArr(arr,idx+1);
            System.out.println(arr[idx]);
            
        }
        
    }

}
