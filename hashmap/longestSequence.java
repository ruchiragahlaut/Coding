package Code1.hashmap;

import java.util.HashMap;
import java.util.Scanner;

/*
17
12
5
1
2
10
2
13
7
11
8
9
11
8
9
5
6
11*/
public class longestSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("hello");
       HashMap<Integer,Boolean> h = new HashMap<>();

       for(int i : arr){
           h.put(i, false);
       }

       for(int i : arr){
           if(h.containsKey(i+1)){
               h.put(i, true);
           }
       }
       
        System.out.println(h);

        int size =0;
        int start =0;
        for(int i : arr){
          if(h.get(i)==true){
            int t =1;
            int tp = i;
             while(h.containsKey(tp+t)){
                t++;
            }
           if(t>size){
              size =t;
              start=tp;
            }
          }
        }
      
    for(int i=start ;i<=size;i++){
        System.out.println(i);
    }
}
}

