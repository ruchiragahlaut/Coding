package Code1.Graphs;
import java.util.*;
import java.util.ArrayList;

/**
 * Introduction -- how to make a graph (syntax) and check that a path is exsist between src and dest
 */
public class Introduction {

    public static class Edge {

        int src;
        int nbr;
        int wt;

        Edge(int src,int nbr,int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static boolean istrue(ArrayList<Edge>[]graph,int src,int dest,boolean [] visited){

        if(src==dest){
            return true;
        }
        visited[src] = true;
        for(Edge e : graph[src]){

            if(visited[e.nbr]==false){
                boolean re = istrue(graph,e.nbr,dest,visited);
                if(re){
                    return true;
                }
            }
            
        }

        return false;



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

            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));
        }

        int src = sc.nextInt();
        int dest = sc.nextInt();

        boolean visited[] = new boolean[vtces];

        boolean res = istrue(graph,src,dest,visited);
        System.out.println(res);

    }
}