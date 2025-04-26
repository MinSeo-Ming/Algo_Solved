class Solution {
    public int solution(int n) {
        int [] re = new int [n+1];
        re[0] =0;
        re[1]=1;
        re[2]=2;
        for(int i=3; i<=n; i++){
            re[i]=(re[i-1]+re[i-2])%1000000007;
        }
        return re[n];
    }
}