import java.util.*;
import java.io.*;
class Solution {
    static boolean[] visited ;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(computers,i,n);
                answer++;
            }
        }
        return answer;
    }
    static void bfs(int [][] com,int i,int n){
        Queue<Integer> q = new LinkedList<>();
        
        
        q.offer(i);
        visited[i]=true;
        while(!q.isEmpty()){
            int out = q.poll();
            for(int j=0; j<n; j++){
                if(!visited[j]&&j!=out&&com[out][j]==1){
                    visited[j] =true;
                    q.offer(j);
                }
            }
        }
        
    }
}