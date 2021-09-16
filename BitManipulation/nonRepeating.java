package Code1.BitManipulation;
import java.lang.reflect.Array;
import java.util.*;
public class nonRepeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        while(i<n){
            
            if(i==n-1 || i==n){
                System.out.println(arr[i]+"hh");
                break;
            }
            else if(arr[i]==arr[i+1]){
                i=i+2;
            }
            else{
                System.out.println(arr[i]+"kk");
                i=i+1;
            }
        }

        
    }
    
}
