import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            TreeMap<Integer,Integer> map = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            for (int j =0; j<k; j++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                char ch = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());

                if(ch=='I')
                    map.put(num, map.getOrDefault(num,0)+1);
                else{
                    if(map.size()==0) continue;
                    if(num==1){
                        int val = map.get(map.lastKey());
                        if(val ==1){
                            map.remove(map.lastKey());
                        }
                        else{
                            map.put(map.lastKey(),val-1);
                        }
                    }else{
                        int val = map.get(map.firstKey());
                        if(val ==1){
                            map.remove(map.firstKey());
                        } else{
                            map.put(map.firstKey(),val-1);
                        }
                    }
                }
            }
            if(map.size()==0){
                System.out.println("EMPTY");
            }else{
                System.out.println(map.lastKey()+" "+map.firstKey());
            }
        }
//        System.out.println(sb.toString());
    }
}
/*
2
7
I 16
I -5643
D -1
D 1
D 1
I 123
D -1
9
I -45
I 653
D 1
I -642
I 45
I 97
D 1
D -1
I 333

 */