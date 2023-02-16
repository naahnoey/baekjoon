package geometry1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 행성계 하나가 주어졌을 때 시작점이나 끝점이 해당 행성계 안에 들어있는 경우 +1
 * 행성계 중심과 시작점 혹은 끝점 사이의 거리가 행성계 반지름보다 작아야 함
 * 
 * 시작점과 끝점이 모두 한 행성계 안에 있는 경우는 세지 않음
 */
public class TheLittlePrince1004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int count = 0;	// 진입/이탈 횟수
			
			// 출발점, 도착점
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			// 행성계 개수
			int n = Integer.parseInt(br.readLine());
			
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				// 시작점 혹은 끝점이 해당 행성계 안에 들어있는지 확인
				int len = (x1-cx)*(x1-cx) + (y1-cy)*(y1-cy);
				int len2 = (x2-cx)*(x2-cx) + (y2-cy)*(y2-cy);
				int r2 = r * r;
				
				if (len < r2 && len2 < r2)
					continue;
				else if (len < r2 || len2 < r2)
					count++;
			}
			bw.write(count + "\n");
		}
		
		bw.close();
	}

}
