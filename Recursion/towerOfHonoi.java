package Recursion;
import java.util.*;
public class towerOfHonoi {

    public static void towerOfHanoi(int n,int a1,int a2,int a3){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, a1, a3, a2);
        System.out.println(n+"["+a1+"->"+a2+"]");
        towerOfHanoi(n-1, a3, a2, a1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, 10, 11, 12);
    }
}
