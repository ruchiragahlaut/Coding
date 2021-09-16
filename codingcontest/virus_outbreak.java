package Code1.codingcontest;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class virus_outbreak {

    public static boolean check(String a1,String a2){

        int m = a1.length();
        int n = a2.length();

        int i=0;
        int j=0;

        while(i<m && j<n){
            char c1 = a1.charAt(i);
            char c2 = a2.charAt(j);
            if(c1==c2){
                j=j+1;
            }
            i=i+1;
        }
        if(j==(n)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());


        for(int i=0;i<n;i++){
            String input = br.readLine();
            if(check(s,input)){
                System.out.println("POSITIVE");
            }
            else{
                System.out.println("NEGATIVE");
            }
        }
        
      

    }
}
