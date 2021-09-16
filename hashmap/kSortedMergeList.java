package Code1.hashmap;
import java.util.*;
public class kSortedMergeList {

    
    public static class Pair implements Comparable <Pair>{
        int val;
        int i;

        Pair(int val,int i){
            this.val = val;
            this.i = i;
        }
        
        @Override
        public int compareTo(Pair o) {
            // TODO Auto-generated method stub
            return  this.val-o.val;
        }
    }
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int i=0;i<k;i++){
            
            ArrayList<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            for(int j=0;j<n;j++){
                int e = sc.nextInt();
                list.add(e);
            }
            lists.add(list);
        }

        PriorityQueue <Pair> pq = new PriorityQueue<>();

        for(int i=0;i<lists.size();i++){
            int val = lists.get(i).get(0);
            pq.add(new Pair(val, i));
        }
        System.out.println(pq);
        ArrayList<Integer> re = new ArrayList<>();
        while(pq.size()>0){
            Pair a = pq.remove();
            ArrayList<Integer> temp = lists.get(a.i);
            int l =0;
            while(temp.size()>0){
                re.add(temp.get(l));
                l++;
            }
        }
        System.out.println(re);
    }
}
