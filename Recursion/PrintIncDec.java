package Recursion;

import java.util.*;


/**
 * PrintDecreasing
 */
public class PrintIncDec {

    public static void printboth(int n){
            
        if(n==0){
            return;
        }
        System.out.println(n);
        printboth(n-1);
        System.out.println(n);
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printboth(n);
    }
    
}