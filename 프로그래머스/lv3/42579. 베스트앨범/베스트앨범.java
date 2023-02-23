import java.util.*;
import java.io.*;
class Solution {
    class Value implements Comparable<Value>{
        int idx;
        int play;
        @Override 
        public int compareTo(Value o){
            if(this.play == o.play){
                return this.idx - o.idx;
            }
            else{
                return o.play - this.play;
                
            } 
        }
        Value(int idx, int play){
            this.idx = idx;
            this.play = play;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        LinkedHashMap<String,ArrayList<Value>> map = new LinkedHashMap<>();
        int len = plays.length;
        HashMap<String, Integer> sum = new HashMap<>();
        
        for(int i=0;i<len; i++){
            ArrayList<Value> list = map.getOrDefault(genres[i],new ArrayList<Value>());
            int sumVal = sum.getOrDefault(genres[i],0);
            
            sumVal+=plays[i];
            list.add(new Value(i,plays[i]));
            
            map.put(genres[i],list);
            sum.put(genres[i],sumVal);
        }
        List<Map.Entry<String,Integer>> entryList = new LinkedList<>(sum.entrySet());
        entryList.sort(new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
                return o2.getValue() -o1.getValue();
            }
        });
        ArrayList<Integer> result = new ArrayList();
        
        for(Map.Entry<String,Integer> entry: entryList){
            ArrayList<Value> temp = map.get(entry.getKey());
            Collections.sort(temp);
            result.add(temp.get(0).idx);
            if(temp.size()>1){
            result.add(temp.get(1).idx);
            }
        }
        
        
        return result.stream().mapToInt(i->i).toArray();
    }
}