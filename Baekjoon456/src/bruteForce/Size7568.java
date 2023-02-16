package bruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Size7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] people = new int[3][n];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			people[0][i] = Integer.parseInt(st.nextToken());
			people[1][i] = Integer.parseInt(st.nextToken());
			people[2][i] = 0;	// 등수
		}
		
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if (people[0][i] > people[0][j] && people[1][i] > people[1][j]) {
					people[2][j]++;
				}
				else if (people[0][i] < people[0][j] && people[1][i] < people[1][j]) {
					people[2][i]++;
				}
			}
		}
		
		for (int i=0; i<n; i++) {
			bw.write(people[2][i]+1 + " ");
		}
		bw.close();
	}

}
