package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 666, 1666, ..., 5666,
 * >> 6661, 6662, ..., 6669, (7~15)
 * 7666, ..., 9666, 10666,
 */
public class MovieDirectorShome1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int title = 666;
		int count = 1;
		
		while (count != n) {
			title++;
			
			if (String.valueOf(title).contains("666")) {
				count++;
			}
		}
		
		System.out.println(title);
	}

}
