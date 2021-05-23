package Recursion;
import java.util.*;
public class printZig {
    

    // pattern -- 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

    public static void zigzag(int n ){

        if(n==0){
            return;
        }
        /* 3      2      1    1   1 */
        System.out.println(n);
        zigzag(n-1);
        System.out.println(n);
        zigzag(n-1);
        System.out.println(n);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zigzag(n);
    }
}
