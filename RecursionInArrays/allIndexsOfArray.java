/* 1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x. 
4. You are required to find the all indices at which x occurs in array a.
5. Return an array of appropriate size which contains all indices at which x occurs in array a.*/
/* Testcase
15
11
40
4
4
9
4
*/

package Code1.RecursionInArrays;
import java.util.*;
/**
 * allIndexsOfArray
 */
public class allIndexsOfArray {
    public static int[]  allindex(int arr[],int i,int fsf,int x){

        if(i==arr.length){
            return new int [fsf];
        }
        if(arr[i]==x){
           int iarr [] = allindex(arr,i+1,fsf+1,x);
           iarr[fsf] = i;
            return iarr;
        }
        else{
            int iarr [] = allindex(arr,i+1,fsf,x);
            return iarr;
        }
       

    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();

     int arr [] = new int[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }

     int x = sc.nextInt();
     int re [] = allindex(arr, 0, 0, x);
     for(int i=0;i<re.length;i++){
        System.out.println(re[i]);
     }

    }
}