package Recursion;
import java.util.*;

/* Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.

Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you. */
public class powerLogLinear {
    public static int pow(int n,int k){
        if(k==0){
            return 1;
        }
        int re = pow(n,k/2);
        int rres = re*re;

        if(k%2==1){
            rres*=n;
        }
        return rres;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int re = pow(n,k);
        System.out.println(re);
    }
}
