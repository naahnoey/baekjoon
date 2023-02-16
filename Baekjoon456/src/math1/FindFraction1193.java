package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int numerator = 1;
		int denominator = 1;
		
		boolean direction = false;
		
		for (int i=1; i<x; i++) {
			if (direction) {
				if (denominator == 1) {
					numerator++;
					direction = false;
					continue;
				}
				numerator++;
				denominator--;
			}
			
			else {
				if (numerator == 1) {
					denominator++;
					direction = true;
					continue;
				}
				numerator--;
				denominator++;
			}
		}
		
		System.out.println(numerator + "/" + denominator);
	}

}
