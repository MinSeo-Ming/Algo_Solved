class Solution {
    public boolean visited [] ;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited= new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]) answer++;
            dfs(i,n,computers);
        }
        return answer;
    }
    public void dfs(int cur,int N,int [][]arr){
        visited[cur] =true;
        for(int i=0; i<N; i++){
            if(!visited[i]&&arr[cur][i]>0)dfs(i,N,arr);
        }
    }
}