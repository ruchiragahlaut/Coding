package Code1.RecursionOnWayUp;
import java.io.*;
import java.util.*;

// INPUT - 78

public class printKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String ques = sc.nextLine();
        printKPC1(ques,"");
    }
    
    public static String codes[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC1(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char c = str.charAt(0);
        String code = codes[c-'0'];
        
        String rem = str.substring(1);
        
       for(int i=0;i<code.length();i++){
           printKPC1(rem,asf+code.charAt(i));
       }
    
        
    }

}