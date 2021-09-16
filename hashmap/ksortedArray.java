package Code1.hashmap;
import java.util.*;
public class ksortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();



       PriorityQueue<Integer> pq = new PriorityQueue<>();
         
       for(int i=0;i<k+1;i++){
           pq.add(arr[i]);
       }

       System.out.println("hello");
       for(int i=k+1;i<n;i++){
           System.out.println(pq.remove());
           pq.add(arr[i]);
       }

       while(pq.size()>0){
           System.out.println(pq.remove());
       }


    }
}
