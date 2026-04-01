package Module16;

import java.util.*;

public class DFSGraph {
    static LinkedList<Integer>[] adj;

    static void DFS(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");

        for(int n:adj[v]){
            if(!visited[n]){
                DFS(n,visited);
            }
        }
    }

    public static void main(String[] args){
        int vertices=5;
        adj=new LinkedList[vertices];
        for(int i=0;i<vertices;i++) adj[i]=new LinkedList<>();

        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(3);
        adj[2].add(4);

        boolean visited[]=new boolean[vertices];
        DFS(0,visited);
    }
}