package Code1.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class frequency {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String ss = sc.next();

        HashMap <Character,Integer> h = new HashMap<>();

        for(int i=0;i<ss.length();i++){
            char c = ss.charAt(i);
            if(h.containsKey(c)){
                int v = h.get(c);
                v=v+1;
                h.put(c, v);
            }
            else{
                h.put(c,0);
            }
        }

        int max = Integer.MIN_VALUE;
        char re = ' ';
;        for(Character c : h.keySet()){
            int freq = h.get(c);
            if(freq>max){
                max = freq;
                re = c;
            }
        }
        System.out.println(re);


    }
    
}
