package Code1.codingcontest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class game {

    public static boolean check(int n){
        if(n==2){
            return true;
        }
        else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String[]  a = br.readLine().split(" ");
            int a1 = Integer.parseInt(a[0]);
            int a2 = Integer.parseInt(a[1]);

            ArrayList<Integer> arr = new ArrayList<>();

            for(int j=a1;j<=a2;j++){
                if(check(j)){
                    arr.add(j);
                }
            }

            if(arr.size()==0){
                System.out.println(-1);
            }
            else if(arr.size()==1){
                System.out.println(0);
            }
            else{
                System.out.println(arr.get(arr.size()-1)-arr.get(0));
            }

        }

        
        
    }
}
