import java.util.*;
import java.io.*;
class Solution {
    public int [][]map ;
    public boolean [][]visited ;
    public int [] dx = {1,0,-1,0};
    public int [] dy = {0,1,0,-1};
    class Point{
        int r;
        int c;
        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    
    public int[] solution(int rows, int columns, int[][] queries) {
        map= new int [rows][columns];
        visited = new boolean[rows][columns];
        int stNum=1;
        //초기화
        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                map[i][j]=stNum++;
            }
        }
        int re;
        
        int[] answer = new int[queries.length];
        int idx =0;
        for(int [] query : queries){
            Point start = new Point(query[0]-1,query[1]-1);
            Point end = new Point(query[2]-1,query[3]-1);
            re =rotate(start,end);
            answer[idx++]=re;
        }
        return answer;
    }
    //달팽이로 풀기
    public int rotate(Point start, Point end ){
        int temp=map[start.r][start.c];
        int min = temp;
        //숫자 방향은 아래에서 위
        //for문 방향은 위에서 아래
        for(int i = start.r; i<end.r ;i++){
            map[i][start.c]=map[i+1][start.c];
            min=min<map[i][start.c]?min:map[i][start.c];
        }
        //숫자 방향은 오른쪽에서 왼쪽
        //for문 방향은 왼쪽에서 오른쪽 
        //숫지 힐딩도 왼쪽에서  현재로
         for(int i = start.c; i<end.c ;i++){
            map[end.r][i]=map[end.r][i+1];
            min=min<map[end.r][i]?min:map[end.r][i];
        }
        //숫자 방향은 위에서 아래
        //for문 방향은 아래에서 위 
        //숫지 힐딩도 위에서  현재
         for(int i = end.r; i>start.r ;i--){
            map[i][end.c]=map[i-1][end.c];
            min=min<map[i][end.c]?min:map[i][end.c];
        }
        //숫자 방향은 왼쪽에서 오른쪽
        //for문 방향은 오른쪽에서 왼 
        //숫지 힐딩도 오른  현재
         for(int i = end.c ; i>start.c ;i--){
            map[start.r][i]=map[start.r][i-1];
            min=min<map[start.r][i]?min:map[start.r][i];
        }
        
        map[start.r][start.c+1]=temp;
        return min;
    }

}