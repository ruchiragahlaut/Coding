package  Code1.RecursionOnWayUp;
import java.util.*;
public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1,2,5,6,9
        //3,4,5,10

        int arr1[] = {1,2,5,6,9};
        int arr2[] = {3,4,5,10};

        int l1 = arr1.length;
        int l2 = arr2.length;

        int i =0;
        int j =0;
        ArrayList<Integer> re = new ArrayList<>();

        while(i<l1 || j<l2){
            
        if(arr1[i]<=arr2[j]){
                re.add(arr1[i]);
                i++;
        }
        else if(arr2[j]<=arr1[i]){
            re.add(arr2[j]);
                j++;
        }
        else if(i==l1 || j==l2){
            if(i==l1){
            while(j<l2){	
                re.add(arr2[j]);
                j++;
            }
            }
            else if(j==l2){
            while(i<l1){	
                re.add(arr1[i]);
                i++;
            }
            }
         }
                
        }

        System.out.println(re);


        
    }
}
