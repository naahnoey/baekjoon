package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int sum = 1;
		sum = factorial(sum, n);
		
		System.out.println(sum);
	}
	
	public static int factorial(int sum, int n) {
		if (n == 0)
			return sum;
		
		sum *= n;
		n--;
		return factorial(sum, n);
	}

}
