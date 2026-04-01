package Module16;

import java.util.*;

public class DetectCycle {
    static LinkedList<Integer>[] adj;

    static boolean cycle(int v,boolean visited[],int parent){
        visited[v]=true;

        for(int n:adj[v]){
            if(!visited[n]){
                if(cycle(n,visited,v)) return true;
            }
            else if(n!=parent){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int v=4;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++) adj[i]=new LinkedList<>();

        adj[0].add(1);
        adj[1].add(0);
        adj[1].add(2);
        adj[2].add(1);
        adj[2].add(3);
        adj[3].add(2);

        boolean visited[]=new boolean[v];

        if(cycle(0,visited,-1))
            System.out.println("Cycle exists");
        else
            System.out.println("No cycle");
    }
}