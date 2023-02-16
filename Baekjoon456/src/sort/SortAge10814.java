package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class SortAge10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// Member 클래스를 타입으로 하는 배열 생성
//		Member[] memberArr = new Member[n];
//		
//		for (int i=0; i<n; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			
//			Member member = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
//			memberArr[i] = member;
//		}
//		// 정렬
//		Arrays.sort(memberArr, (Member m1, Member m2) -> {
//			return m1.getAge() - m2.getAge();
//		});
//		
//		StringBuffer sb = new StringBuffer();
//		for (Member m : memberArr) {
//			sb.append(m.getAge()).append(' ').append(m.getName()).append('\n');
//		}
//		System.out.println(sb);
		
		// input 나이 1~200
		StringBuilder[] member = new StringBuilder[201];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			// 인덱스 비어있는 경우 StringBuilder 객체 생성
			if (member[age] == null)	member[age] = new StringBuilder();
			
			member[age].append(age).append(' ').append(name).append('\n');
		}
		
		StringBuilder sb = new StringBuilder();
		for (StringBuilder s : member) {
			if (s == null)	continue;
			sb.append(s);
		}
		System.out.println(sb);
	}
	
	// 회원의 이름과 나이를 저장
//	static class Member {
//		private int age;
//		private String name;
//		
//		public int getAge() {
//			return age;
//		}
//		public void setAge(int age) {
//			this.age = age;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		
//		public Member(int age, String name) {
//			this.age = age;
//			this.name = name;
//		}
//	}
}
