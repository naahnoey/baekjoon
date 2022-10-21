package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sum11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String strN = br.readLine();
		
		int sum = 0;
		for (int i=0; i<n; i++) {
			sum += strN.charAt(i) - '0';
		}
		bw.write(sum + "");
		bw.close();
		
		// n 입력 필요 X
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br.readLine();	// n 입력 건너뜀
//		
//		int sum = 0;
//		
//		for(byte value:br.readLine().getBytes()) {
//			sum+=(value-'0');
//		}
//		System.out.print(sum);
	}

}
