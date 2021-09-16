package Code1.Graphs;
import java.util.*;
import java.util.ArrayList;

// You have to print all the paths that are exsists in graph -->
public class printAllThePaths {

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

    public static void allPaths(ArrayList<Edge>[]graph,boolean [] visited,int vtx,int dest,String psf){

      if(vtx == dest){
          System.out.println(psf);
      }
      visited[vtx] = true;

      for(Edge e:graph[vtx]){
          if(visited[e.nbr]==false){
             allPaths(graph,visited,e.nbr,dest,psf+e.nbr);
          } 
      }

      visited[vtx] = false;

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
        boolean [] visited = new boolean[vtces];
        allPaths(graph,visited,src,dest,""+src);
        

    }
}