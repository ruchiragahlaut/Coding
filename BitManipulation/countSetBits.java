package Code1.BitManipulation;
import java.util.*;

// count set bits in a number 
/*
input - 6
output - 2----->(110)
*/
public class countSetBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count =0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        System.out.println(count);
    }
    
}
