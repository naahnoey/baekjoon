package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack2798 {
	
	public static int blackJack(int m, int[] vals) {
		int sum = 0;
		int tmp = 0;
		int sub = 300_000;
		
		for (int i=0; i<vals.length-2; i++) {
			for (int j=i+1; j<vals.length-1; j++) {
				for (int k=j+1; k<vals.length; k++) {
					tmp = vals[i] + vals[j] + vals[k];
					
					if (sub > Math.abs(m-tmp) && tmp <= m) {
						sub = Math.abs(m-tmp);
						sum = tmp;
					}
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] vals = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			vals[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(blackJack(m, vals));
	}

}
