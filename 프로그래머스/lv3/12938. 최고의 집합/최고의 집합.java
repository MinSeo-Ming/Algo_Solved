class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        int idx =0;
        while(n>1){
            if(s/n==0)return new int[]{-1};
            
            answer[idx]= s/n;
            n--;
            s-=answer[idx++];
        }
        answer[idx]= s;
        return answer;
    }
}