class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        int queryCnt = queries.length;
        int s,e,k;
        for(int i =0; i < queryCnt; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            for(int j =s;j<=e; j++){
                if(j==0|| j %k==0){
                    answer[j] +=1;
                }
            }
        }
        return answer;
    }
}