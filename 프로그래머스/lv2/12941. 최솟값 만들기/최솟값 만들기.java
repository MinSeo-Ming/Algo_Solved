import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        int len = A.length;
        int order =0;
        int preOrder =0;
        for(int i=0; i<len; i++){
            order += A[i]*B[len-1-i];
            preOrder += B[i]*A[len-i-1];
        }
        return Math.min(order,preOrder);
    }
}