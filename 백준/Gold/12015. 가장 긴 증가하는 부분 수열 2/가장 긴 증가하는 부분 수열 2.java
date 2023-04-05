import java.io.*;
import java.util.*;

public class Main {
    static int N,cnt;
	static int[] arr,lis;
	public static void main(String [] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		lis = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i]=Integer.parseInt(st.nextToken());
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
		
		System.out.println((j+1));
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
