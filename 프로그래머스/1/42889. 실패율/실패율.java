import java.util.*;
import java.io.*;
class Solution {
    
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int [] ch = new int [N+2];
        for(int st : stages){
            ch[st]++;
        }
        // stage 별 실패한 사람수
        HashMap<Integer,Double> people = new HashMap<>();
        
        double total = stages.length;
        for(int i=1; i<=N; i++){
            if(ch[i]==0){//전부다 성공
                people.put(i,0.);
            }else{
                people.put(i,ch[i]/total);
                total -=ch[i];
            }
        }
        return people.entrySet().stream().sorted(
            (o1,o2)-> 
                o1.getValue().equals(o2.getValue()) ? 
                    Integer.compare(o1.getKey(),o2.getKey()) : Double.compare(o2.getValue(),o1.getValue())
        ).mapToInt(HashMap.Entry::getKey).toArray();
        
            
    }
}