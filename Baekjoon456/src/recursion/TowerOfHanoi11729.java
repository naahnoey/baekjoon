package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TowerOfHanoi11729 {
	
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void movePlate(int n, int from, int mid, int to) throws IOException {
		if (n == 1) {
			bw.write(from + " " + to + "\n");
			return;
		}
		
		movePlate(n-1, from, to, mid);
		bw.write(from + " " + to + "\n");
		movePlate(n-1, mid, from, to);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		bw.write((int)Math.pow(2, n) - 1 + "\n");
		
		movePlate(n, 1, 2, 3);
		
		bw.close();
	}

}
