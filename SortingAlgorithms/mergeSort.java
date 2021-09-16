package Code1.SortingAlgorithms;
import java.util.*;
public class mergeSort {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    
        int i = 0, j =0, k = 0;
        int[] ans = new int[a.length + b.length];
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
              ans[k] = a[i];
              i++;
              k++;
            }else{
              ans[k] = b[j];
              j++;
              k++;
            }
        }
    
        while(i < a.length){
          ans[k] = a[i];
          k++;
          i++;
        }
    
        while(j < b.length){
          ans[k] = b[j];
          k++;
          j++;
        }
        
        return ans;
      }
    public static int[]  mergesort(int []arr,int l,int r){
       if(l==r){
        int[] bans = new int[1];
        bans[0] = arr[l];
        return bans;
       }
       int mid = (l+r)/2;
       int[] lsa = mergesort(arr,l,mid);
       int[] rsa = mergesort(arr,mid + 1,r);
       int[] ans = mergeTwoSortedArrays(lsa,rsa);
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }
        int[] sa = mergesort(arr,0,arr.length - 1);
        System.out.print("Sorted Array -> ");
        for(int i=0;i<sa.length;i++){
            System.out.print(sa[i]);
        }
    }
}
