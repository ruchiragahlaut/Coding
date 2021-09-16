package Code1.Graphs.BreadthFirst;
import java.util.*;
/* 7
8
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
6
3 */
public class spreadInfection {

    static class Edge {
        int src;
        int nbr;
  
        Edge(int src, int nbr) {
           this.src = src;
           this.nbr = nbr;
        }
     }
     static class Pair{
         int v;
         int time;
         
         Pair(int v,int time){
             this.v = v;
             this.time = time;
         }
     }
    public  static int count =0;
     public static void findt(ArrayList<Edge>[] graph,boolean visited[] ,int vtx,int t){
         ArrayDeque<Pair> pq = new ArrayDeque<>();
         pq.add(new Pair(vtx,1));
         while(pq.size()>0){
             Pair rem = pq.removeFirst();

             if(rem.time>t){
                 break;
             }
             if(visited[rem.v]==true){
                 continue;
             }
             else{
                visited[rem.v] = true;
                count++;
             }
             for(Edge e : graph[rem.v] ){
                 if(visited[e.nbr]==false){
                     pq.add(new Pair(e.nbr,rem.time+1));
                 }
             }
         }
     }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vtces = sc.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[vtces];

        for(int i=0;i<vtces;i++){
            graph[i] = new ArrayList<>();
        }

        int edges = sc.nextInt();
        for(int i=0;i<edges;i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int wt = sc.nextInt();
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
        int vtx = sc.nextInt();
        int t = sc.nextInt();

        boolean [] visited = new boolean[vtces];
        findt(graph, visited, vtx, t);
        System.out.println(count);

        
    }
}
