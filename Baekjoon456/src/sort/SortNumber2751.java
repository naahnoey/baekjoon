package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortNumber2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] num = new boolean[2_000_001];
		
		for (int i=0; i<n; i++) {
			num[Integer.parseInt(br.readLine()) + 1_000_000] = true;
		}
		
		for (int i=0; i<num.length; i++) {
			if (num[i])
				sb.append(i - 1_000_000).append('\n');
		}
		
		System.out.println(sb);
	}

}