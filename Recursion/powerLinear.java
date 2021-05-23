package Recursion;
import java.util.*;
public class powerLinear {
    public static int pow(int n,int k){
        if(k==0){
            return 1;
        }
        else{
            return n*pow(n,k-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int re = pow(n,k);
        System.out.println(re);
    }
}
