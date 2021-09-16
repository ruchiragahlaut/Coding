package Code1.RecursionInArrayList;

/**
 * subsequence

 * input -- abc
 * output -- [, c, b, bc, a, ac, ab, abc]
 
 */

import java.util.*;
public class subsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int n = sc.nextInt();

        String [] input = new String[n];
        for(int i=0;i<n;i++){
            input[i] = sc.next();
        }
        
        ArrayList<String> rres = gss(s);
        for(int i=0;i<n;i++){
            if(rres.contains(input[i])){
                System.out.println("POSITIVE");
            }
            else{
                System.out.println("NEGATIVE");
         }
    }
        
        
        
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