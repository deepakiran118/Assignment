package Module16;

import java.util.*;

public class PrintNeighbors {
    public static void main(String[] args){
        int v=4;

        LinkedList<Integer>[] adj=new LinkedList[v];

        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();

        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(3);

        int node=0;

        System.out.print("Neighbors: ");

        for(int n:adj[node]){
            System.out.print(n+" ");
        }
    }
}
