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
        show(graph);
        System.out.println();
        System.out.print("DFS:");
        dfs(graph,vis, 6);
          
        System.out.println();
        System.out.print("BFS:");
        bfs(graph, V, 0);

    }
}


























'''Theory:
A graph is a data structure consisting of vertices (nodes) and edges (connections) that connect pairs
of vertices. It can be directed or undirected, and weighted or unweighted depending on the use-case.
● Adjacency List Representation
The adjacency list is one of the most memory-efficient ways to represent a graph, especially when
the graph is sparse (contains fewer edges).
● Each node maintains a list of all its adjacent (connected) vertices.
● This structure typically uses a hash map or array of lists in Java.
Breadth-First Search (BFS)
BFS explores the graph level by level starting from a source vertex.
● It uses a queue data structure to track vertices to be explored next.
● BFS is ideal for finding the shortest path in unweighted graphs.

Steps:
1. Start at the source node.
2. Visit all its neighbours.
3. Visit the neighbours’ neighbours next, and so on.
Depth-First Search (DFS)

DFS explores as far as possible along each branch before backtracking.
● It uses a stack (explicit or via recursion).
● DFS is used for cycle detection, topological sorting, and checking connectivity.

Steps:
1. Start at the source node.
2. Visit a neighbour, then its neighbour, and so on until no unvisited nodes remain.
3. Backtrack and repeat for other unexplored paths'''