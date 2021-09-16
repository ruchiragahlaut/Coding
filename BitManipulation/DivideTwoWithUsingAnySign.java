package Code1.BitManipulation;
import java.util.*;
public class DivideTwoWithUsingAnySign {

    public static int divide(int a, int b){

        int sign = (a<0 || b<0 ? -1 :1);
        int quotient =0;
        // a = dividend
        // b = divisior

        while(a>=b){
            a=a-b;
            quotient++;
        }

        if(sign==-1){
            quotient = - quotient;
        }
        return quotient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println(divide(a,b));
        

    }
    
}
