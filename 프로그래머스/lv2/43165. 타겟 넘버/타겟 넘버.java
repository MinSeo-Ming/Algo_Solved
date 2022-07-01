
class Solution {
    int answer =0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,0,target,0);
        return answer;
    }
    public void dfs(int []numbers, int cur, int target,int sum){
        if(cur == numbers.length){
            if(sum == target)answer++;
            
        }else{
        dfs(numbers,cur+1,target, sum+numbers[cur]);   
        dfs(numbers,cur+1,target, sum-numbers[cur]);
        }
    }
}