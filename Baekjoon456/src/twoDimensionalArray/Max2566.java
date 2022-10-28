package twoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = -1;
		int maxi = -1;
		int maxj = -1;
		for (int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int j=0; j<9; j++) {
				int val = Integer.parseInt(st.nextToken());
				if (val > max) {
					max = val;
					maxi = i + 1;
					maxj = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(maxi + " " + maxj);
	}

}
