import java.util.*;
import java.io.*;
class Solution {
    static class Node{
        int x;int y;int length;
         Node(int x, int y ,int length){
            this.x = x;
            this.y= y;
            this.length = length;
        }
    }
    static int minVisited = Integer.MAX_VALUE;
    static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public int solution(int[][] maps) {
        bfs(maps, maps.length, maps[0].length);
        if(minVisited==Integer.MAX_VALUE){
            return -1;
        }
        return minVisited;
    }
    public static void bfs(int[][]maps, int M, int N){
        boolean visited [][]= new boolean[M][N];
        Queue<Node> q = new LinkedList<>();
        visited[0][0]= true;
        q.add(new Node(0,0,1));
        while(!q.isEmpty()){
            Node node = q.poll();
            int x = node.x;
            int y = node.y;
            int length = node.length;
            if(x==M-1 && y==N-1){
              minVisited = Math.min(minVisited,length);  
            }
            for(int i=0; i<4; i++){
                int temp_x = x+dir[i][0];
                int temp_y = y+dir[i][1];
                if(temp_x>=0&&temp_y>=0 && temp_x<M&& temp_y<N&&maps[temp_x][temp_y]==1&&!visited[temp_x][temp_y]){
                    visited[temp_x][temp_y]=true;
                    q.add(new Node(temp_x,temp_y,length+1));
                }
            }
        }
        
    }
}