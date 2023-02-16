package setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class StringSet14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> strings = new HashSet<String>();
		
		for (int i=0; i<n; i++) {
			strings.add(br.readLine());
		}
		
		int count = 0;
		for (int i=0; i<m; i++) {
			String s = br.readLine();
			
			if (strings.contains(s))
				count++;
		}
		
		System.out.println(count);
	}

}
