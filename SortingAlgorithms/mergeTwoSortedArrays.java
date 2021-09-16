package Code1.SortingAlgorithms;
import java.time.YearMonth;
import java.util.*;
public class mergeTwoSortedArrays {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr1[] = {1,2,3,4,5,6,7};
    int arr2[] = {1,2,8,9,10};


    int i =0;
    int j=0;

    int n1 = arr1.length;
    int n2 = arr2.length;

    while(i<n1 && j<n2){
      

        if(arr1[i]<arr2[j]){
            System.out.print(arr1[i]+" ");
            i++;
        }
        else if(arr2[j]<arr1[i]){
            System.out.print(arr2[j]+" ");
            j++;
        }
        else if(arr1[i]==arr2[j]){
            System.out.print(arr1[i]+" ");
            System.out.print(arr2[j]+" ");
            i++;
            j++;

        }
        
    }

    int m =i;
    int n = j;
    while(m!=(n1)){
        System.out.print(arr1[m]+" ");
        m++;
    }
    while(n!=(n2)){
        System.out.print(arr2[n]+" ");  
        n++;
    }
  

}

}