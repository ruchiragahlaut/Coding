package Code1.BasicQuestion;
import java.util.*;
import Code1.BasicQuestion.gcd;

public class lcm {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = n1*n2/gcd(n1,n2);
        System.out.println(ans);
        

    }

    private static int gcd(int a, int b) {
        if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
