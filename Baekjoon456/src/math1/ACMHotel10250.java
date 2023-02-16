package math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ACMHotel10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int h = Integer.parseInt(st.nextToken());
			st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			if (n % h == 0) {
				bw.write(h*100 + n/h + "\n");
				continue;
			}
			
			bw.write(n%h*100 + n/h + 1 + "\n");
		}
		
		bw.close();
	}

}
