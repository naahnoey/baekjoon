package geometry1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * r + r' > d
 * r' - r < d
 */
public class Turret1002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			int len = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
			int r3 = (r1 + r2) * (r1 + r2);
			int r4 = (r1 - r2) * (r1 - r2);
			
			if (len == 0 && r4 == 0)
				bw.write(-1 + "\n");
			else if (len < r3 && len > r4)
				bw.write(2 + "\n");
			else if (len == r3 || len == r4)
				bw.write(1 + "\n");
			else if (len > r3 || len < r4)
				bw.write(0 + "\n");
		}
		
		bw.close();
	}

}
