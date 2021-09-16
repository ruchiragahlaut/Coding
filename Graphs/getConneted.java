package Code1.Graphs;
import java.util.*;


/* 1. You are given a graph.
2. You are required to find and print if the graph is connected (there is a path from 
     every vertex to every other). */
     
public class getConneted {
    static class Edge {
        int src;
        int nbr;
        int wt;
  
        Edge(int src, int nbr, int wt) {
           this.src = src;
           this.nbr = nbr;
           this.wt = wt;
        }
     }
    public static void checkConneted(ArrayList<Edge>[] graph,boolean [] visited,ArrayList<Integer> comp,int vtx){

        comp.add(vtx);
        visited[vtx]=true;
        
        for(Edge e : graph[vtx]){
            if(visited[e.nbr]==false){
                //comp.add(e.nbr);
                checkConneted(graph, visited,comp,e.nbr);
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

            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean visited[] = new boolean[vtces];
        // write your code here
        for(int i=0;i<vtces;i++){
            if(visited[i]==false){
                ArrayList <Integer> comp = new ArrayList<>();
                checkConneted(graph,visited,comp,i);
                comps.add(comp);
            }   
        }
        System.out.println(comps.size()==1);
    }
}
