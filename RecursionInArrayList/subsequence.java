package Code1.RecursionInArrayList;

/**
 * subsequence
 * input -- abc
 */

import java.util.*;
public class subsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        ArrayList<String> rres = gss(s);
        System.out.println(rres);
        
        
        
    }

    public static ArrayList<String> gss(String str) {
       
        if(str.length()==0){
            ArrayList<String> rr = new ArrayList<>();
            rr.add("");
            return rr;
        }

        char c = str.charAt(0);
        String rem = str.substring(1);
        ArrayList<String> re = gss(rem);

        ArrayList <String> mre = new ArrayList<>();

        for(String s:re){
            mre.add(""+s);
        }

        for(String s:re){
            mre.add(c+s);
        }

        return mre;
     }
}