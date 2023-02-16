package setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SymmetricDifference1269 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int numA = Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());
		
		HashSet<Integer> a = new HashSet<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numA; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		int n = numB;
		for (int i = 0; i < n; i++) {
			int b = Integer.parseInt(st.nextToken());
			
			if (a.contains(b)) {
				numA--;
				numB--;
			}
		}
		
		System.out.println(numA + numB);
	}

}
