package Code1.BasicQuestion;
import java.util.*;
public class gcd {

    public static int gcd (int a ,int b){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        int ans = gcd(n1,n2);
        System.out.println(ans);

    }
}
