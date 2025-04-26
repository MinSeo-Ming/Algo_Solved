class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int depth =0;
        int zero=0;
        int len,a_len;
        while(!s.equals("1")){
            len = s.length();
            a_len = s.replace("0","").length();
            depth+=1;
                
            zero += len-a_len;
            
            s = Integer.toBinaryString(a_len);
        }
        answer[0]=depth;
        answer[1]=zero;
        
        return answer;
    }
}