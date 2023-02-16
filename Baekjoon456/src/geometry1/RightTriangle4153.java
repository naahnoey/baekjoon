package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a==0 && b==0 && c==0)
				break;
			
			if (a*a == b*b + c*c) {
				sb.append("right" + "\n");
			} else if (b*b == c*c + a*a) {
				sb.append("right" + "\n");
			} else if (c*c == a*a + b*b) {
				sb.append("right" + "\n");
			} else {
				sb.append("wrong" + "\n");
			}
		}
		
		System.out.println(sb);
	}

}