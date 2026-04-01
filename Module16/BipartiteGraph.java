package Module16;

import java.util.*;

public class BipartiteGraph {
    static LinkedList<Integer>[] adj;

    static boolean bipartite(){
        int color[]=new int[adj.length];
        Arrays.fill(color,-1);

        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        color[0]=0;

        while(!q.isEmpty()){
            int node=q.poll();

            for(int n:adj[node]){
                if(color[n]==-1){
                    color[n]=1-color[node];
                    q.add(n);
                }
                else if(color[n]==color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int v=4;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++) adj[i]=new LinkedList<>();
        adj[0].add(1);
        adj[1].add(2);
        adj[2].add(3);
        System.out.println(bipartite());
    }
}