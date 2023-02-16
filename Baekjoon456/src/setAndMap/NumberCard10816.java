package setAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NumberCard10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		/*
		 * 상근이가 갖고 있는 카드
		 * HashMap<숫자 카드 넘버, 개수>
		 */
		HashMap<Integer, Integer> cards = new HashMap<Integer, Integer>();
		for (int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if (cards.containsKey(num)) {
				int count = cards.get(num) + 1;
				cards.put(num, count);
			} else {
				cards.put(num, 1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<m; i++) {
			int val = Integer.parseInt(st.nextToken());
			
			if (cards.containsKey(val)) {
				bw.write(cards.get(val) + " ");
			} else {
				bw.write(0 + " ");
			}
		}
		
		bw.close();
	}

}
