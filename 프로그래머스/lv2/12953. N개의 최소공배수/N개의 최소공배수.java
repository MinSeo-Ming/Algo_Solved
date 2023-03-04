class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int len = arr.length;
        int temp;
        for(int i=1; i<len; i++){
            temp = gcd(answer,arr[i]);
            answer = answer * arr[i] /temp;
        }
        
        return answer;
    }
    public int gcd(int a, int b){
        if(a <b){
            int n = b;
            b= a;
            a =n;
        }
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}