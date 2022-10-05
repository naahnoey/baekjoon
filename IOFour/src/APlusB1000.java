import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 1000

public class APlusB1000 {

	public static void main(String[] args) throws IOException {
		
		// 1.
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.println(a + b);
		
		// 2.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한 줄에 여러 개의 정수를 받기 위해 사용
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a2 = Integer.valueOf(st.nextToken());
		int b2 = Integer.valueOf(st.nextToken());

		System.out.println(a2 + b2);

		
		sc.close();
		
	}

}
