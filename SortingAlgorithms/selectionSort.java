package Code1.SortingAlgorithms;
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {5,7,-2,4,1,3};

        for(int i=0;i<arr.length-1;i++){
            int mi = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mi]){
                   mi = j;
                }
            }
            int temp = arr[mi];
            arr[mi] = arr[i];
            arr[i] = temp;

        }



        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
