package RecursionInArrays;
import java.util.*;

public class DisplayArray {

    public static void Display(int[] arr,int l){
        if(l==arr.length){
            return ;
        }
        else{
            System.out.println(arr[l]);
            Display(arr,l+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Display(arr, 0);
    }
}
