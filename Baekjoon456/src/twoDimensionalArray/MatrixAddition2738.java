package twoDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MatrixAddition2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j=0; j<m; j++)
				a[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j=0; j<m; j++)
				b[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++)
				bw.write(a[i][j] + b[i][j] + " ");
			bw.write("\n");
		}
		bw.close();
	}

}
