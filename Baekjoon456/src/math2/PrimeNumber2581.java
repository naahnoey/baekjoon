package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int min = 0;
		int sum = 0;
		
		for (int i=m; i<=n; i++) {
			if (isPrime(i)) {
				if (sum == 0)	min = i;
				sum += i;
			}
		}
		
		if (sum == 0)	System.out.println(-1);
		else {
			sb.append(sum);
			sb.append("\n");
			sb.append(min);
			System.out.println(sb);
		}
	}

	public static boolean isPrime(int num) {
		if (num == 1)	return false;
		
		for (int i=2; i*i<=num; i++) {
			if (num % i == 0)	return false;
		}
		return true;
	}
}
