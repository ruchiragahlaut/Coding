package Code1.BasicQuestion;
import java.util.*;
public class character {
    public static void main(String[] args) {
        String s = "ruchira";

        int st = 97;
        int ed = 122;

        String ans = "";
        for(int i=0;i<s.length();i++){
            int re = s.charAt(i);
            int diff = re-st;
            ans = ans+ (char)(ed-diff);
        }

        System.out.print(ans);
    }
}
