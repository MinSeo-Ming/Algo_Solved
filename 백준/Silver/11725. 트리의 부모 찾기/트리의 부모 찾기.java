import java.io.*;
import java.util.*;


public class Main {
    static int result [];
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        for(int i=0; i<= num; i++)
            graph.add(new ArrayList<Integer>());

        for(int i=0; i<num-1; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph.get(end).add(start);

            graph.get(start).add(end);
        }
        result = new int[num+1];
        dfs(1);
        for(int i =2; i<=num; i++){
            System.out.println(result[i]);
        }

    }
    static void dfs(int root){
        for(int i=0; i<graph.get(root).size(); i++){
            int idx = graph.get(root).get(i);
            if(result[idx]==0){
                result[idx]=root;
                dfs(idx);
            }
        }
    }
}
