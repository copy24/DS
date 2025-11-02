import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Edge{
    int src,dest;

    Edge(int s,int d){
        src=s;
        dest=d;
    }
}   


public class graph1{

    public static void create_edge(ArrayList<Edge> graph[],int s,int d){
        graph[s].add(new Edge(s, d));
    }
    
    public static void show(ArrayList<Edge> graph []){
        for(int i=0;i<graph.length;i++){
            System.out.print(i+"->");
            for(Edge a:graph[i]){
                System.out.print(a.dest+" ");
            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<Edge> graph[],int V,int start){
        Queue <Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[V];

        q.add(start);

        while(q.isEmpty()==false){
            int curr=q.remove();
            if(vis[curr]==false){
                vis[curr]=true;
                System.out.print(curr+" ");

                for(Edge a:graph[curr]){
                    q.add(a.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[],boolean vis[],int curr){
        if(vis[curr]==true){
            return;
        }
        vis[curr]=true;
        System.out.print(curr+" ");
        for(Edge a:graph[curr]){
            dfs(graph, vis, a.dest);
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        boolean vis[]=new boolean[V];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        create_edge(graph, 0, 1);
        create_edge(graph, 0, 2);

        create_edge(graph, 1, 0);
        create_edge(graph, 1, 3);

        create_edge(graph, 2, 0);
        create_edge(graph, 2, 4);

        create_edge(graph, 3, 1);
        create_edge(graph, 3, 4);
        create_edge(graph, 3, 5);

        create_edge(graph, 4, 2);
        create_edge(graph, 4, 3);
        create_edge(graph, 4, 5);

        create_edge(graph, 5, 3);
        create_edge(graph, 5, 4);
        create_edge(graph, 5, 6);

        create_edge(graph, 6, 5);

        dfs(graph,vis, 6);
    }
}