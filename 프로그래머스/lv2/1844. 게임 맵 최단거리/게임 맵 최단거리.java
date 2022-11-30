import java.io.*;
import java.util.*;
class Solution {
    static class Node{
        int data;
        int x;
        int y;
        Node(int x, int y, int data){
            this.x =x;
            this.y =y;
            this.data =data;
        }
    }
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int answer = Integer.MAX_VALUE;
    static Queue<Node> queue = new LinkedList<>();
    public int solution(int[][] maps) {
        bfs(0,0,maps, maps.length, maps[0].length);
        if(answer==Integer.MAX_VALUE){
            return -1;
        }
        return answer;
    }
    public static void bfs(int x,int y,int[][] maps,int len_x,int len_y){
        boolean [][]visited = new boolean[len_x][len_y];
        visited[0][0] =true;
        queue.add(new Node(x,y,1));
        while(!queue.isEmpty()){
            Node pop = queue.poll();
            x = pop.x;
            y = pop.y;
            int data = pop.data;
            if(x==len_x-1&& y==len_y-1){
                answer= Math.min(answer,data);
            }
            for(int i=0; i<4; i++){
                int temp_x = x+ dx[i];
                int temp_y = y+ dy[i];
                if(temp_x>=0 &&temp_y>=0 && temp_x<len_x && temp_y<len_y&&maps[temp_x][temp_y]==1&& !visited[temp_x][temp_y]){
                    visited[temp_x][temp_y]=true;
                    queue.add(new Node(temp_x,temp_y,data+1));

                }
            }

        }
    }
}