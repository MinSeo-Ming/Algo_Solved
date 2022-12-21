class Solution {
    public int solution(int n) {
        int answer = 0;
        int left =0, right=1,sum=0;
        while(left<=right&&left<=n){
            sum+=right;
            if(sum==n){
                answer++;
            }
            while(sum>n){
                left++;
                sum -=left;
                if(sum==n){
                    answer++;
                }
            }
            right++;
            
        }
        return answer;
    }
}