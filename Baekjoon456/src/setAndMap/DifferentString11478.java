package setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DifferentString11478 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		HashSet<String> partStr = new HashSet<String>();
		
		// len = 부분 문자열 길이
		for (int len = 1; len <= str.length(); len++) {
			for (int i = 0; i <= str.length() - len; i++) {
				String subStr = str.substring(i, i+len);
				partStr.add(subStr);
			}
		}
		System.out.println(partStr.size());
	}

}
