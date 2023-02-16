package setAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Unknown1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<String> noHear = new HashSet<String>();
		ArrayList<String> noHearNoSee = new ArrayList<String>();
		
		for (int i = 0; i < n; i++) {
			noHear.add(br.readLine());
		}
		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			
			if (noHear.contains(name))	noHearNoSee.add(name);
		}
		
		Collections.sort(noHearNoSee);
		
		bw.write(noHearNoSee.size() + "\n");
		
		for (String name : noHearNoSee) {
			bw.write(name + "\n");
		}
		bw.close();
	}

}
