package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 분해합 구하기
 * 어떤 자연수 n이 주어졌을 때 해당 수의 가장 작은 생성자 찾기
 */
public class DecompositionSum2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<1_000_000; i++) {
			int sum = i;
			
			int tmp = i;	// 각 자릿수 더하기 위함
			while (tmp != 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			
			if (sum == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

}
