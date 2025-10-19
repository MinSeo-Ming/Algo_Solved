class Solution {
    public int[] solution(int[] num_list) {
    
        int [] result =new int[num_list.length];
        for(int i =num_list.length-1,  idx =0; i>=0; i--){
            result[idx++]=num_list[i];
        }
        return result;
    }
}