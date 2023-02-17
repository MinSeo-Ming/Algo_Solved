class Solution {
    public int solution(int n) {
        int bitCnt = Integer.bitCount(n);
        while(true){
            n++;
            int nBitCnt = Integer.bitCount(n);
            if(bitCnt == nBitCnt)
                return n;
        }
        
    }
    
}