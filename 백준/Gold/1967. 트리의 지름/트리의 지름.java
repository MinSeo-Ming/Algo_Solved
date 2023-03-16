import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node{
        int idx;
        int weight;
        Node(){
        }
        Node(int idx, int weight){
            this.idx = idx;
            this.weight = weight;
        }
    }
    static int N;
    static boolean []visited;
    static long MAX = Long.MIN_VALUE;
    static long WEIGHT[];
    static ArrayList<Long> leafNodeList ;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        visited = new boolean[N+1];
        WEIGHT = new long[N+1];

        for (int i = 0; i <= N ; i++) {
            graph.add(new ArrayList<Node>());
        }
        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int root = Integer.parseInt(st.nextToken());
            int leaf = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            graph.get(root).add(new Node(leaf,weight));
        }
        br.close();
        if(N==1){
            System.out.println(0);
            return;
        }
        bfs(1);
        visited = new boolean[N+1];

        for (int i = 1; i < N; i++) {
            ArrayList<Node> nodes = graph.get(i);
            if(nodes.size()>=2){
                ArrayList<Long> getWeigthSum = new ArrayList<>();
                for(Node node : nodes){
                    leafNodeList = new ArrayList<>();
                    dfs(node.idx);
                    Collections.sort(leafNodeList);
                    long getMax = leafNodeList.get(leafNodeList.size()-1);
                    getWeigthSum.add(getMax);
                }
                Collections.sort(getWeigthSum,Collections.reverseOrder());

                long sum = getWeigthSum.get(0) + getWeigthSum.get(1)- WEIGHT[i]*2;
                MAX = Math.max(MAX,sum);

            }else if(nodes.size()==1){

                leafNodeList = new ArrayList<>();
                dfs(nodes.get(0).idx);
                Collections.sort(leafNodeList);
                long getMax = leafNodeList.get(leafNodeList.size()-1) - WEIGHT[i];
                MAX= Math.max(MAX,getMax);

            }
        }
        System.out.println(MAX);
    }
    static void bfs(int idx){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(idx,0));

        while (!q.isEmpty()){
            Node node = q.poll();
            visited[node.idx]=true;
            ArrayList<Node> nodes = graph.get(node.idx);
            for(Node n: nodes){
                if(!visited[n.idx]) {
                    q.add(n);
                    n.weight += node.weight;
                    WEIGHT[n.idx] = n.weight;
                }
            }

        }
    }
    static void dfs(int idx){
        visited[idx]=true;
        ArrayList<Node> list = graph.get(idx);
        if(list.size()==0){
            leafNodeList.add(WEIGHT[idx]);
        }
        for(Node n : list){
            dfs(n.idx);

        }
    }
}
