package sort;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class SortInside1427 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		int n = System.in.read();
		while (n>='0' && n<='9') {
			number.add(n - '0');
			n = System.in.read();
		}
		
		Collections.sort(number, Collections.reverseOrder());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i : number) {
			bw.write(i + "");
		}
		bw.close();
	}

}
