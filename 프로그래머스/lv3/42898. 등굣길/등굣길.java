class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int [][]map = new int[n][m];
        if(puddles[0].length > 0){
            for(int x[] : puddles){
                map[x[1]-1][x[0]-1] = -1;
            }
        }
        for(int i = 1 ;i < n; i++){
            map[i][0] = (map[i][0] == -1 | map[i-1][0] == -1) ? -1 : 1;
        }
        for(int j = 1 ;j < m ;j++){
            map[0][j] = (map[0][j] == -1 | map[0][j-1] == -1) ? -1 : 1;
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(map[i][j] != -1){
                    int a = map[i-1][j] == -1 ? 0 : map[i-1][j];
                    int b = map[i][j-1] == -1 ? 0 : map[i][j-1];   
                    map[i][j] = (a+b) == 0 ? -1 : (a+b) % 1000000007;
                }
            }
        }
        return map[n-1][m-1] == -1 ? 0 : map[n-1][m-1];
    }
}