import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int len_last = triangle[len-1].length;
        for(int i= len-2; i>=0; i--){
            for(int j=0; j<i+1; j++){
                triangle[i][j]= Math.max((triangle[i][j]+triangle[i+1][j]),(triangle[i][j]+triangle[i+1][j+1]));
            }
        }
        
        return triangle[0][0];
    }
}