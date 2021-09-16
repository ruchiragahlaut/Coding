package Code1.Graph.BreadthFirst;
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
2 */

public class bfs {

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
         String p;

         Pair(int v,String path){
            this.v = v;
            this.p = path;
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

        int src = sc.nextInt();
        ArrayDeque <Pair> pq = new ArrayDeque<>();
        boolean [] visited = new boolean[vtces];
        pq.add(new Pair(src,src+""));

        while(pq.size()>0){
            Pair rem = pq.removeFirst();

            if(visited[rem.v]==true){
                continue;
            }
            visited[rem.v] = true;
            System.out.println(
                rem.v+"@"+rem.p
            );

            for(Edge e :graph[rem.v]){
                if(visited[e.nbr]==false){
                    pq.add(new Pair(e.nbr,rem.p+e.nbr));
                }
            }
        }
    }
}
