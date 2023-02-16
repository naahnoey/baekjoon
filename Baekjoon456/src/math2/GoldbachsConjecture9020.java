package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachsConjecture9020 {

	static boolean[] primeNumber;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		checkPrime(10000);
		
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			for (int j=n/2; j>1; j--) {
				if (!primeNumber[j] && !primeNumber[n-j]) {
					sb.append(j).append(' ').append(n-j).append('\n');
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
	
	static void checkPrime(int num) {
		primeNumber = new boolean[num + 1];
		
		primeNumber[0] = primeNumber[1] = true;
		
		for (int i=2; i<=Math.sqrt(num); i++) {
			if (primeNumber[i])
				continue;
			
			for (int j=i*i; j<primeNumber.length; j+=i)
				primeNumber[j] = true;
		}
	}

}
