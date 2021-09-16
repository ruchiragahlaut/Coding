package Code1.hashmap;
import java.util.*;
public class getComman {
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


        HashMap<Integer,Boolean> h1 = new HashMap<>();

        for(int val : arr1){

            h1.put(val,true);
        }

        for(int i=0;i<n2;i++){
            if(h1.containsKey(arr2[i])){
                System.out.println(arr2[i]);
                h1.remove(arr2[i]);
            }
        }


    }
    
}
