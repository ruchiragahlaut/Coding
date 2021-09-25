package Code1.BasicQuestion;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int a=0;
        int b=0;

        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println(n1);
        System.out.println(n2);


    }
}
