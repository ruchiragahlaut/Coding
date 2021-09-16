package Code1.BitManipulation;
import java.util.*;
public class countTotalBitsIn {

    public static int countSetBits(int n){
        int count =0;

        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // System.out.println("hello");

        int re =0;

        for(int i=1;i<=n;i++){
            int r = countSetBits(i);
            re+=r;
        }
        System.out.println(re);

    }
}
