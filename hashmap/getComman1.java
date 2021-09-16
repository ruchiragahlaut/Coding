package Code1.hashmap;
import java.util.*;
public class getComman1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }


       HashMap<Integer,Integer> h1 = new HashMap<>();

       for(int i : arr1){
            if(h1.containsKey(i)){
                int v = h1.get(i);
                h1.put(i, v+1);
            }
            else{
                h1.put(i,1);
            }
       }

       //System.out.print(h1);
       //System.out.println("hello");
       for(int i=0;i<n2;i++){
        if(h1.containsKey(arr2[i])){
           int g = h1.get(arr2[i]);
           if(g!=0){
                System.out.println(arr2[i]);
                g--;
                h1.put(arr2[i],g);
               }
           }
       }

    }
    
}
