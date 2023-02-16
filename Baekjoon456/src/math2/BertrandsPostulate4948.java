package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BertrandsPostulate4948 {

	static boolean[] prime;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		while (n != 0) {
			checkPrime(2*n);
			
			int count = 0;
			
			for (int i=n+1; i<=2*n; i++) {
				if (!prime[i])
					count++;
			}
			
			sb.append(count).append('\n');
			n = Integer.parseInt(br.readLine());
		}
		
		System.out.println(sb);
	}
	
	static void checkPrime(int num) {
		// true - 소수 X
		// false - 소수 O
		prime = new boolean[num + 1];
		
		if (num == 1)	return;
		
		prime[0] = prime[1] = true;
		
		for (int i=2; i<=Math.sqrt(num); i++) {
			if (prime[i] == true)
				continue;
			
			for (int j=i*i; j<prime.length; j+=i)
				prime[j] = true;
		}
	}

}
