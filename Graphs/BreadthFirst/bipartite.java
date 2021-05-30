package Graphs.BreadthFirst;
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
4 6 10 */
public class bipartite {

    
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
        String psf;
        int level;
        Pair(int v,String psf,int level){
            this.v = v;
            this.psf = psf;
            this.level = level;
        }
    }

    public static boolean ischeck(ArrayList<Edge>[] graph,int visited[],int vtx){
        ArrayDeque<Pair> pq = new ArrayDeque<>();
        pq.add(new Pair(vtx,vtx+"",0));
        while(pq.size()>0){
            Pair rem = pq.removeFirst();
            if(visited[rem.v]!=-1){
                if(rem.level!=visited[rem.v]){
                    // not coming same level so that's why there is cycle and called bipartite
                    return false;
                }
            }
            visited[rem.v] = rem.level;

            for(Edge e : graph[rem.v]){
                if(visited[e.nbr]==-1){
                    pq.add(new Pair(e.nbr,rem.psf+e.nbr,rem.level+1));
                }
            }

        }
        return true;
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

        int [] visited = new int[vtces];
        Arrays.fill(visited, -1);

        for(int i=0;i<vtces;i++){
            if(visited[i]==-1){
                boolean rres = ischeck(graph,visited,i);
                if(rres==false){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
    
}
