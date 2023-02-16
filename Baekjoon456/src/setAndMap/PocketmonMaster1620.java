package setAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PocketmonMaster1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> pocketmon = new HashMap<>();
		String[] names = new String[n+1];
		
		for (int i=1; i<=n; i++) {
			String name = br.readLine();
			
			pocketmon.put(name, i);
			names[i] = name;
		}
		
		for (int i=0; i<m; i++) {
			String q = br.readLine();
			
			/*
			 * 입력받은 내용이 숫자인지 문자열인지 확인
			 * 숫자면 get() 함수 이용해 이름 받아오기
			 * 문자열이면 indexOf() 함수 이용해 해당 문자열의 인덱스 찾기
			 */
			if (q.charAt(0) >= '0' && q.charAt(0) <= '9') {
				bw.write(names[Integer.parseInt(q)] + "\n");
			} else {
				bw.write(pocketmon.get(q) + "\n");
			}
		}
		
		bw.close();
	}

}
