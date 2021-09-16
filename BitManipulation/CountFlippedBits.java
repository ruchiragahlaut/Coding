package Code1.BitManipulation;
import java.util.*;
public class CountFlippedBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int re = a^b;
        int count =0;
        while(re!=0){
            re = re&re-1;
            count++;
        }
        
       System.out.println(count);
        
    }
    
}
