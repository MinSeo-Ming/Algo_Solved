class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr2[0].length;
        int[][] answer = new int[row][col];
        for(int i= 0; i<row; i++){
            for(int j =0; j<col; j++){
                int [] r = arr1[i];
                int s = r.length;
                for(int k=0; k<s; k++){
                    answer[i][j] += r[k] *arr2[k][j];
                }
            }
        }
        return answer;
    }
}