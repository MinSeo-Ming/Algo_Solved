import java.util.*;
import java.io.*;
import java.util.stream.Collectors;


class Solution {
    public boolean[] isPrime;
    public HashSet<Integer> set;
    public boolean[] visited;
    char [] nums;
    
    public void prime(int M){
        Arrays.fill(isPrime,true);
        isPrime[0] =false;
        isPrime[1] =false;
        for(int i=2; i*i<=M; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=M; j+=i){
                    isPrime[j]=false;
                }
            }
        }
        
    }
    
    public void dfs(char[]nums,String sb, int depth){
        if(!sb.equals("")){
            set.add(Integer.parseInt(sb.toString()));
        }
        
        if(depth == nums.length)return;
        
        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(nums, sb+nums[i],depth+1);
                visited[i]=false;
            }
        }
    }
    
    public int solution(String numbers) {
        int answer = 0;
        nums = numbers.toCharArray();
        set = new HashSet<>();
        visited = new boolean[nums.length];
        StringBuilder sb = new StringBuilder();
        
        dfs(nums, "",0);
        
        int MAX = Collections.max(set);
        isPrime = new boolean[MAX+1];
        
        prime(MAX);
        
        List<Integer> list = set.stream().collect(Collectors.toList());
        
        
        for(int nn: list){
            if(isPrime[nn]) {
                answer++;
            }
        }
        
        return answer;
        
    }
    
}