package Code1.DynamicProgramming;
import java.io.*;
import java.util.*;
    

// Here we are executing a fib code with three approaches 
    public class Fibonacci{
        public static int fibMemory(int n ,int arr[]){
            if(n==0 || n==1){
                return n;
            }
         
            if(arr[n]!=0){
                return  arr[n];
            }

            int n1 = fibMemory(n-1, arr);
            int n2 = fibMemory(n-2, arr);
            int re = n1+n2;
            arr[n] = re;
            System.out.println(re);

            return re;
        }
        public static int fibTable(int n){
            int arr[] = new int[n+1];

            for(int i=0;i<arr.length;i++){
                if(i==0){
                    arr[i] =0;
                }
                else if(i==1){
                    arr[i] =1;
                }
                else{
                    arr[i] = arr[i-1]+arr[i-2];
                }
            }
            return arr[n];
        }

        public static int fibRecursive(int n ){
            if(n==0 || n==1){
                return n; 
            }

            return fibRecursive(n-1)+fibRecursive(n-2);
        }
    
   
    
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        
        int re = fibMemory(n,arr);
        System.out.println(re);

     
        int re1 = fibTable(n);
        System.out.println(re1);
        
        int re2 = fibRecursive(n);
        System.out.println(re2);
     }
    
    }