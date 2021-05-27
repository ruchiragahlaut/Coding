package Graphs;
import java.util.*;

public class perfectFriends {
   
    static class Edge {
        int src;
        int nbr;
        int wt;
  
        Edge(int src, int nbr, int wt){   
           this.src = src;
           this.nbr = nbr;
           this.wt = wt;
        }
     }


    public static void isCheck(ArrayList<Edge>[] graph,boolean [] visited,int vtx,ArrayList<Integer> comp){
        visited[vtx] = true;
        comp.add(vtx);

        for(Edge e :graph[vtx]){
            //System.out.println(e.src+"``````````````"+e.nbr);
            if(visited[e.nbr]==false){
                isCheck(graph, visited, e.nbr, comp);
            }
        }
    }

     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();

      ArrayList<Edge> [] graph = new ArrayList[n];

      for(int i=0;i<n;i++){
          graph[i] = new ArrayList<>();
      }

      for(int i=0;i<k;i++){

            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int wt =0;
           

            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));   
      }

      boolean [] visited = new boolean[n];

      ArrayList <ArrayList<Integer>> comps = new ArrayList<>();

      for(int v=0;v<n;v++){
        if(visited[v]==false){
            ArrayList <Integer> comp = new ArrayList<>();
            isCheck(graph,visited,v,comp);
            comps.add(comp);
        }
      }

      System.out.println(comps);
      int re = 0;
      for(int i=0;i<comps.size();i++){

        for(int j=i+1;j<comps.size();j++){

            int c = comps.get(i).size() * comps.get(j).size();
            re+=c;
        }

      }

      System.out.println(re);


     }
}
