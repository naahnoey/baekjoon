package math1;

import java.util.Scanner;

public class Honeycomb2292 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int max = 1;
		int count = 1;
		
		while (n > max) {
			max += 6 * count;
			count++;
		}
		
		System.out.println(count);
		scanner.close();
	}

}