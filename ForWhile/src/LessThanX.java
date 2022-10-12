import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class LessThanX {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		// 사용자가 숫자 몇 개를 입력하든 상관 없는 방법(n 입력 받을 필요 X)
//		st = new StringTokenizer(br.readLine());
//		do {
//			int a = Integer.parseInt(st.nextToken());
//			if (a < x)
//				bw.write(a + " ");
//		} while (st.hasMoreTokens());
		
		st = new StringTokenizer(br.readLine());
		
		int a;
		for (int i=0; i<n; i++) {
			a = Integer.parseInt(st.nextToken());
			if (a < x)
				bw.write(a + " ");
		}

		bw.close();
		
	}

}
