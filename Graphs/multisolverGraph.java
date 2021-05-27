package Graphs;
import java.util.*;

/* ques
1. You are given a graph, a src vertex and a destination vertex.
2. You are give a number named "criteria" and a number "k".
3. You are required to find and print the values of 
3.1 Smallest path and it's weight separated by an "@"
3.2 Largest path and it's weight separated by an "@"
3.3 Just Larger path (than criteria in terms of weight) and it's weight separated by an "@"
3.4 Just smaller path (than criteria in terms of weight) and it's weight separated by an "@"
3.5 Kth largest path and it's weight separated by an "@"
*/
public class multisolverGraph{


    // global varibale -->
    static String smallest_path;
    static Integer smallest_path_wt = Integer.MAX_VALUE;

    static String largest_path;
    static Integer largest_path_wt = Integer.MIN_VALUE;

    static String smallerJ_path;
    static Integer smallerJ_path_wt = Integer.MAX_VALUE;

    static String largerJ_path;
    static Integer largerJ_path_wt = Integer.MIN_VALUE;

    static PriorityQueue <Pair> pq = new PriorityQueue<>();


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
     // For the priority queue you have to execute Pair class
     static class Pair implements Comparable<Pair>{
        int wsf;
        String psf;
        Pair(int wsf,String psf){

            this.wsf = wsf;
            this.psf = psf;
        }
        public int compareTo(Pair o){
            // sort in ascending order of weight_so_far
            return this.wsf - o.wsf;
         }
     }

     public static void calculate(ArrayList<Edge>[]graph,boolean[]visited,int src,int dest,int criteria,int k,int wsf,String psf){

        if(src == dest){
        if(wsf<smallest_path_wt){
            smallest_path_wt =wsf;
            smallest_path = psf;
            
        }
        if(wsf>largest_path_wt){
            largest_path_wt = wsf;
            largest_path = psf;
            
        }
       
            if(pq.size()<k){
                pq.add(new Pair(wsf,psf));
            }
            else{
                Pair re = pq.remove();
                pq.add(new Pair(wsf,psf));
            }
        

        if( wsf>criteria && wsf<smallerJ_path_wt){
            smallerJ_path_wt = wsf;
            smallerJ_path = psf;
        }

        if( wsf<criteria && wsf>largerJ_path_wt){
            largerJ_path_wt = wsf;
            largerJ_path = psf;
        }
        return;

    }

    visited[src] =true; 

    for(Edge e : graph[src]){
        if(visited[e.nbr]==false){
            calculate(graph,visited,e.nbr,dest,criteria,k, wsf+e.wt ,psf+e.nbr);
        }
    }

    visited[src] = false;

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

        int criteria = sc.nextInt();
        int k =sc.nextInt();

        int wsf = 0;
        String psf = src+"";
        boolean [] visited = new boolean[vtces];
        calculate(graph,visited,src,dest,criteria,k,wsf,psf);
        

        System.out.println("Smallest Path = " + smallest_path + "@" + smallest_path_wt);
        System.out.println("Largest Path = " + largest_path + "@" + largest_path_wt);
        System.out.println("Just Larger Path than " + criteria + " = " + smallerJ_path + "@" + smallerJ_path_wt);
        System.out.println("Just Smaller Path than " + criteria + " = " + largerJ_path + "@" + largerJ_path_wt);
        System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);

    }    
}
