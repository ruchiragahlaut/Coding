package Code1.RecursionOnWayUp;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PrintSupSequence {

    public static boolean recurs(String str,String ans,String input){
       
        if(str.length()==0){
            if(ans.equals(input)){
                return true;
            }
            else{
                return false;
            }
        }
        
        char c = str.charAt(0);
        String rem = str.substring(1);

        boolean flag1 = recurs(rem,ans+c,input);
        boolean flag2 = recurs(rem, ans+"",input);

        if(flag1 || flag2){
            return true;
        }
        else{
            return false;
        }

}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        String [] input = new String[n];
        for(int i=0;i<n;i++){
            input[i] = br.readLine();
        }
        
        
        for(int i=0;i<n;i++){
            boolean rres = recurs(s,"",input[i]);
            if(rres){
                System.out.println("POSITIVE");
            }
            else{
                System.out.println("NEGATIVE");
            }
        }
}

}
