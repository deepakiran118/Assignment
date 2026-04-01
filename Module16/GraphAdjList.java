package Module16;

import java.util.*;

public class GraphAdjList {
    int V;
    LinkedList<Integer>[] adj;
    GraphAdjList(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i] = new LinkedList<>();
    }
    void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
    }
    void printGraph(){
        for(int i=0;i<V;i++){
            System.out.print(i + " -> ");
            for(int node : adj[i])
                System.out.print(node + " ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        GraphAdjList g = new GraphAdjList(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.printGraph();
    }
}