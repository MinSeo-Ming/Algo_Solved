class Solution {
    public int solution(int n) {
        int answer = 0,left =1, right=1,sum=0;
        while(left<=n){
            sum+=right;
            if(right==n){
                answer++;
                break;
            }
            if(sum>n){
                while(sum>=n){
                    if(sum==n){
                        answer++;
                        break;
                    }else{
                        sum-=left;
                        left++;
                    }
                }
            }
            else if(sum==n){
                answer++;
            }
            right++;
        }
        return answer;
    }
}