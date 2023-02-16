package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		switch (n % 5) {
		case 0:
			System.out.println(n / 5);
			break;
			
		case 4:
			if (n < 9) {
				System.out.println(-1);
				break;
			}
			// count = n/5 - 1 + 3;
			System.out.println(n/5 + 2);
			break;
			
		case 3:
			System.out.println((n / 5) + (n % 5 / 3));
			break;
			
		case 2:
			if (n < 12) {
				System.out.println(-1);
				break;
			}
			// count = n/5 - 2 + 4
			System.out.println(n/5 + 2);
			break;
			
		case 1:
			System.out.println(n/5 + 1);
			break;
		}
	}

}
