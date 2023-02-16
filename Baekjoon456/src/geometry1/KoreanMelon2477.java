package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KoreanMelon2477 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int k = Integer.parseInt(br.readLine());
		
		int[] field = new int[6];
		
		int width = 0;
		int height = 0;
		int widthIndex = -1;
		int heightIndex = -1;
		
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			
			int direction = Integer.parseInt(st.nextToken());
			field[i] = Integer.parseInt(st.nextToken());
			
			if ((direction == 1 || direction == 2) && field[i] > height) {
				height = field[i];
				heightIndex = i;
			}
			else if ((direction == 3 || direction == 4) && field[i] > width) {
				width = field[i];
				widthIndex = i;
			}
		}
		
		int right, left;
		int minWidth, minHeight;
		
		// 가로
		if (widthIndex == 0)	right = 5;
		else					right = widthIndex - 1;
		
		if (widthIndex == 5)	left = 0;
		else					left = widthIndex + 1;
		
		minWidth = Math.abs(field[right] - field[left]);
		
		// 세로
		if (heightIndex == 0)	right = 5;
		else					right = heightIndex - 1;
		
		if (heightIndex == 5)	left = 0;
		else					left = heightIndex + 1;
		
		minHeight = Math.abs(field[right] - field[left]);
		
		
		System.out.println((width*height - minWidth*minHeight) * k);
	}

}
