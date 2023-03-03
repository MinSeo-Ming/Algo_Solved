import java.io.*;
import java.util.*;

public class Main {
    static long [] arr;
    static int N,M,K,log,power, MOD =1000000007;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N =Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());
        K =Integer.parseInt(st.nextToken());
        log =((int)(Math.log(N)/Math.log(2)));
        power =(int)(Math.pow(2,log));
        // 만약 2^log 보다 N 이 크면 log ++ & power *2;
        if(power< N){
            log++;
            power =power<<1;
        }
        arr = new long[power*2];
        Arrays.fill(arr,1);
        //2^k 번째 부터 입력받기
        for (int i = 0; i < N; i++) {
            arr[power+i]= Long.parseLong(br.readLine());
        }
        //세그먼트 트리 구간합 구하기
        for(int i=power-1; i>=0; i--){
            arr[i]= (arr[(2*i)+1] *arr[(2*i)])%MOD;
        }
        for(int i=0; i<K+M; i++){
            st = new StringTokenizer(br.readLine());
            long order = Long.parseLong(st.nextToken());
            int inOne = Integer.parseInt(st.nextToken());
            long inTwo = Long.parseLong(st.nextToken());
            if(order==1){
                update(inOne,inTwo);
            }else if(order==2){
                System.out.println(mul(inOne,(int)inTwo));
            }else{
                return;
            }

        }
    }
    static void update(int idx, long val){
        int realIdx = idx -1 + power;
        arr[realIdx] =val;
        while(realIdx>1){
            realIdx = realIdx>>1;
            arr[realIdx] = arr[realIdx *2] %MOD * arr[realIdx*2+1]%MOD;
        }
    }
    static long mul(int st, int ed){
        st = st + power -1;
        ed = ed + power -1;
        long result =1;
        while(st<=ed){
            if(st%2==1){
                result= result *arr[st]%MOD;
                st++;
            }
            if(ed%2==0){
                result=result *arr[ed]%MOD;
                ed--;
            }
            st = (st)/2;
            ed = (ed)/2;

        }
        return result;
    }
}
