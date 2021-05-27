package RecursionOnWayUp;
import java.util.*;

public class PrintSupSequence {

    public static void recurs(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
      
        char c = str.charAt(0);
        String rem = str.substring(1);

        recurs(rem,ans+c);
        recurs(rem, ans+"");


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        recurs(s,"");
    }
}
