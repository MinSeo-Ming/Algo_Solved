import java.util.Stack;
class Solution {
    public int solution(int[][] arr, int[] move) {
        int n = arr.length;
        int m = move.length;
        int answer =0;
        Stack<Integer> list = new Stack<>();
        for (int i = 0; i < m; i++) {
            int y = move[i]-1;
            out: for (int j = 0; j < n; j++) {
                if(arr[j][y]!=0){
                    if(!list.isEmpty()&&list.peek()==arr[j][y]){
                        list.pop();
                        arr[j][y]=0;
                        answer+=2;

                    }
                    else{
                        list.add(arr[j][y]);
                        arr[j][y]=0;
                    }
                    break out;
                }
            }
        }
        return answer;
    }
}