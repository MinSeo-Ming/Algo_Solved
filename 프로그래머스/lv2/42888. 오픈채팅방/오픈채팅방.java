import java.util.*;
class Solution {
    public String[] solution(String[] record){
        String result="",t1,t2;
        List<String>arr = new ArrayList<>();
        String[] st= {};
        String[] answer = {};
        String e ="님이 들어왔습니다.";
        String o ="님이 나갔습니다.";
        Map<String ,String > id_name = new LinkedHashMap<>();
        for(String t : record){
            st= t.split(" ");
            if(st.length>2) {
                id_name.put(st[1], st[2]);
            }
        }
        for(String t : record){
            st = t.split(" ");
            if(st[0].charAt(0)=='C')continue;
            else if(st[0].charAt(0)=='E')arr.add(id_name.get(st[1])+e);
            else arr.add(id_name.get(st[1])+o);
        }
        answer = new String[arr.size()];
        arr.toArray(answer);

        return answer;
    }
}