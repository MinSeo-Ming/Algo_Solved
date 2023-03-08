class Solution {
    long [] arr = new long[2001];
    public long solution(int n) {
        arr[0] =0;
        arr[1] =1;
        arr[2] =2;
        for(int i=3; i<2001; i++){
            arr[i] = (arr[i-2]+arr[i-1])%1234567;
        }
        return arr[n];
    }
}