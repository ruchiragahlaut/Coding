package DynamicProgramming;
import java.io.*;
import java.util.*;
    

// Here we are executing a fib code with three approaches 
    public class Fibonacci{
    
    
    public static int fibRecursive(int n ,int arr[]){
        if(n==0 || n==1){
            return n;
        }
        
        int a1 = fibRecursive(n-1,arr);
        int a2 = fibRecursive(n-2,arr);
        int a3 = a1+a2;
        return a3;
    }
    
    public static int fibMemory(int n ,int arr[]){
        if(n==0 || n==1){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        
        int a1 = fibMemory(n-1,arr);
        int a2 = fibMemory(n-2,arr);
        int a3 = a1+a2;
        
        arr[n] = a3;
        return a3;
    }
    
    public static int fibTable(int n){
        int arr[] = new int[n+1];
        
        for(int i=0;i<=n;i++){
            if(i==0){
                arr[i] =0;
            }
            else if(i==1){
                arr[i] = 1;
            }
            else{
                arr[i] = arr[i-1]+arr[i-2];
            }
        }
        return arr[n];
        
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
        
        int re2 = fibRecursive(n,arr);
        System.out.println(re2);
     }
    
    }