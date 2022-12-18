class Solution {
    static int answer =0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,0,target,0);
        return answer;
    }
    public void dfs(int[] numbers, int sum, int target, int index){
        if(index ==numbers.length){
            if(target== sum){
                answer++;
            }
            return;
        }else{
        dfs(numbers,sum+numbers[index],target,index+1);
        dfs(numbers,sum-numbers[index],target,index+1);
        }
    }
}