package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumber1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for (int i=m; i<=n; i++) {
			if (isPrime(i))
				sb.append(i).append('\n');
		}
		
		System.out.println(sb);
	}
	
	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		
		for (int i=2; i*i<=num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
