package Module16;

import java.util.*;

public class TraverseGraph {
    static LinkedList<Integer>[] adj;

    static void BFS(int start){
        boolean visited[]=new boolean[adj.length];

        Queue<Integer> q=new LinkedList<>();

        visited[start]=true;

        q.add(start);

        while(!q.isEmpty()){
            int node=q.poll();

            System.out.print(node+" ");

            for(int n:adj[node]){
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args){
        int v=5;

        adj=new LinkedList[v];

        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();

        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(3);
        adj[2].add(4);

        BFS(0);
    }
}