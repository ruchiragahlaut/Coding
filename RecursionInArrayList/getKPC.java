package RecursionInArrayList;

/**
 * getKPC
 * 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 
input - 78
 */
import java.util.*;
public class getKPC {


    static String [] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        
        if(str.length()==0){
            ArrayList <String> ss = new ArrayList<>();
            ss.add("");
            return ss; 
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);

        ArrayList <String> rres = getKPC(rem);
        System.out.println(rres);
        ArrayList <String> finalre = new ArrayList<>();
        String code = codes[ch-'0'];
        for(int i=0;i<code.length();i++){

            char c = code.charAt(i);
            System.out.println(c)   ;
            for(String s:rres){
                finalre.add(c+s);
            }


        }
        return finalre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        
        ArrayList<String> re = getKPC(n);
        System.out.println(re);
        
    }
}