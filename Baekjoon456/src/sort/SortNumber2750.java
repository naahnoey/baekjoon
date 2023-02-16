package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortNumber2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] val = new int[n];
		
		for (int i=0; i<n; i++) {
			val[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(val);
		
		for (int i : val) {
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);
	}

}
