package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortWord1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		for (int i=0; i<n; i++) {
			String w = br.readLine();

			wordMap.put(w, w.length());
		}

		// 정렬
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(wordMap.entrySet());
		entryList.sort((w1, w2) -> {
			if (w1.getValue() == w2.getValue()) {
				// 문자열 정렬
				for (int i=0; i<w1.getValue(); i++) {
					if (w1.getKey().charAt(i) != w2.getKey().charAt(i))
						return w1.getKey().charAt(i) - w2.getKey().charAt(i);
				}
				return 0;
			}
			else
				return w1.getValue() - w2.getValue();
		});
		
		StringBuffer sb = new StringBuffer();
		for (Entry<String, Integer> e : entryList) {
			sb.append(e.getKey()).append('\n');
		}
		System.out.println(sb);
	}

}
