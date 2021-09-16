package Code1.SortingAlgorithms;
import java.util.*;
public class quickort {

    public static int partition(int [] arr,int pivot,int l,int h){
        int i=l;
        int j=l;

        while(i<=h){
            if(arr[i]<=pivot){
                swap(arr, i, j);
                i++;
                j++;
            }
            else{
                i++;
            }
        }   
        return j-1;
    }

    public static void swap(int[] arr, int i, int j) {
       
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }

    public static void quicksort(int arr[],int l,int h){
        if(l>h){
            return;
        }
        int pivot = arr[h];
        int id = partition(arr,pivot,l,h);
        quicksort(arr, l, id-1);
        quicksort(arr, id+1, h);
    }

    public static void main(String[] args) {
        int [] arr = {5,7,-2,4,1,3};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } 
    }
}
