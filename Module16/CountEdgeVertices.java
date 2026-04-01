package Module16;

import java.util.*;

public class CountEdgeVertices {
    public static void main(String[] args){
        int v=4;

        LinkedList<Integer>[] adj=new LinkedList[v];

        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();

        adj[0].add(1);
        adj[1].add(0);
        adj[1].add(2);
        adj[2].add(1);

        int edges=0;

        for(int i=0;i<v;i++){
            edges+=adj[i].size();
        }

        edges/=2;

        System.out.println("Vertices="+v);
        System.out.println("Edges="+edges);
    }
}