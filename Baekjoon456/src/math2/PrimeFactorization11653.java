package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Vector;

public class PrimeFactorization11653 {

//	static Vector<Integer> primeNum = new Vector<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=2; i*i<=n; i++) {
			while (n % i == 0) {
				sb.append(i).append("\n");
				
				n /= i;
			}
		}
		
		if (n != 1) {
			sb.append(n);
			sb.append("\n");
		}
		
		System.out.println(sb);
//		primeNum.add(factorization(n));
//		
//		for (int p : primeNum) {
//			if (p == 1)
//				break;
//			
//			sb.append(p);
//			sb.append("\n");
//		}
//		
//		System.out.println(sb);
	}
	
//	public static boolean isPrime(int num) {
//		if (num == 1)	return false;
//		
//		for (int i=2; i*i<=num; i++) {
//			if (num % i == 0)	return false;
//		}
//		
//		return true;
//	}
//	
//	public static int factorization(int num) {
//		if (isPrime(num))	return num;
//		
//		int val;
//		if (primeNum.isEmpty())	val = 2;
//		else	val = primeNum.lastElement();
//		
//		for (int i=val; i*i<=num; i++) {
//			if (!isPrime(i))	continue;
//			
//			if (num % i == 0) {
//				primeNum.add(i);
//				num /= i;
//				return factorization(num);
//			}
//		}
//		
//		return num;
//		for (int i=2; i*i<=num; i++) {
//			if (num % i == 0) {
//				
//			}
//		}
//	}
//
}
