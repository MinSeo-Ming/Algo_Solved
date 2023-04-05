
import java.io.*;
import java.util.*;

public class Main {
	static int N,MAX= Integer.MIN_VALUE,MIN= Integer.MAX_VALUE;
	static int[] arr,op = new int[4];
	public static void main(String [] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int [N];
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			op[i]= Integer.parseInt(st.nextToken());
		}
		dfs(arr[0],1);
		System.out.println(MAX);
		System.out.println(MIN);
	}
	public static void dfs(int num, int idx) {
		if(idx==N) {
			MAX = Math.max(num, MAX);
			MIN = Math.min(num, MIN);
			return;
			
		}
		for(int i=0; i<4; i++) {
			if(op[i]>0) {
				op[i]--;
				switch(i) {
				case 0: dfs(num+arr[idx],idx+1);break;
				case 1: dfs(num-arr[idx],idx+1);break;
				case 2: dfs(num*arr[idx],idx+1);break;
				case 3: dfs(num/arr[idx],idx+1);break;
				}
				op[i]++;
			}
		}
	}
}
