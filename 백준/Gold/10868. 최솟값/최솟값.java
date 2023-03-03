import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static long [] arr;
    static int N,M,log,power;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N =Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());
        log =((int)(Math.log(N)/Math.log(2)));
        power =(int)(Math.pow(2,log));
        // 만약 2^log 보다 N 이 크면 log ++ & power *2;
        if(power< N){
            log++;
            power =power<<1;
        }
        arr = new long[power*2];
        Arrays.fill(arr,Long.MAX_VALUE);

        //2^k 번째 부터 입력받기
        for (int i = 0; i < N; i++) {
            arr[power+i]= Long.parseLong(br.readLine());
        }
        //세그먼트 트리 구간합 구하기
        for(int i=power-1; i>=0; i--){
            arr[i]= Math.min(arr[(i*2)+1],arr[i*2]);
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int inOne = Integer.parseInt(st.nextToken());
            int inTwo = Integer.parseInt(st.nextToken());

            System.out.println(getMin(inOne,inTwo));

        }
    }

    static long getMin(int st, int ed){
        st = st + power -1;
        ed = ed + power -1;

        long result =Long.MAX_VALUE;
        while(st<=ed){
            if(st%2==1){
                result =  Math.min(result,arr[st]);
                st++;
            }
            if(ed%2==0){
                result=Math.min(result,arr[ed]);
                ed--;
            }
            st /=2;
            ed /=2;

        }
        return result;
    }
}
