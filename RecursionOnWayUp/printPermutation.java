package RecursionOnWayUp;
import java.util.*;
public class printPermutation {


    public static void perm(String s,String ans){

        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            String l = s.substring(0,i);
            String r = s.substring(i+1);

            String rem = l+r;
            perm(rem, ans+ch);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        perm(s,"");
    }
    
}
