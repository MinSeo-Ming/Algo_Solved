import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int V,E;
    static ArrayList<Edge> list = new ArrayList<Edge>();
    static class Edge implements Comparable<Edge>{
        int vertex1;
        int vertex2;
        int weight;

        @Override
        public int compareTo(Edge o) {
            return this.weight- o.weight;
        }
        Edge(){}
        Edge(int vertex1,int vertex2, int weight){
            this.vertex1 = vertex1;
            this.vertex2 = vertex2;
            this.weight = weight;
        }
    }
    static int[] parent;
    static long WEIGHT =0;
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        parent = new int[V+1];
        for (int i = 0; i <=V ; i++) {
            parent[i]=i;
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(new Edge(v1,v2,w));
        }
        Collections.sort(list);
        for (int i = 0; i < E; i++) {
            Edge edge = list.get(i);
            if(find(edge.vertex1)!=find(edge.vertex2)){
                union(edge.vertex1, edge.vertex2);
                WEIGHT+= edge.weight;
            }
        }
        System.out.println(WEIGHT);


    }
    static int find(int a){
        if(a== parent[a])
            return parent[a];
        else return parent[a] =find(parent[a]);
    }
    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b) parent[b]=a;
    }
}
