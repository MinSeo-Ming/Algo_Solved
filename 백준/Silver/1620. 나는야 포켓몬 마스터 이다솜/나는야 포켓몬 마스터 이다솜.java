import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int pocat = Integer.parseInt(st.nextToken());
        int pro = Integer.parseInt(st.nextToken());

        Map<String, Integer> str_map = new HashMap<>();
        Map< Integer,String> int_map = new HashMap<>();

        for (int i = 1; i <= pocat ; i++) {
            String in = br.readLine();
            str_map.put(in,i);
            int_map.put(i,in);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pro; i++) {
            String in = br.readLine();
            boolean check = in.chars().allMatch(Character::isDigit);
            if(check){
                sb.append(int_map.get(Integer.parseInt(in))).append("\n");
            }else{
                sb.append(str_map.get(in)).append("\n");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
