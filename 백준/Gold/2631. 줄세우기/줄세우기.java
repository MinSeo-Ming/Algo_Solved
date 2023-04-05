
import java.util.*;
import java.io.*;

public class Main {
	static int N,cnt;
	static int[] arr,lis;
	public static void main(String [] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		lis = new int[N];
		for(int i =0; i<N; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		lis [0]=arr[0];
		int i=1;
		int j=0;
		while (i<N) {
			if(lis[j] <arr[i]) {
				lis[j+1]= arr[i];
				j++;
			}else {
				int idx = search(0,j,arr[i]);
				lis[idx]= arr[i];
			}
			i++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = N-(j+1);
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
	static int search(int left, int right, int t) {
		int mid;
		while(left<right) {
			mid = (left+right)/2;
			if(lis[mid]<t) {
				left = mid+1;
			}else {
				right =mid;
			}
		}
		return right;
	}

}
