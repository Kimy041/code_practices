package do_it.chap01;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		 System.out.println("정수를 입력해주세요."); 
		 System.out.print("a의 값 : "); int a = scanner.nextInt(); 
		 System.out.print("b의 값 : "); int b = scanner.nextInt();
		 System.out.print("c의 값 : "); int c = scanner.nextInt();
		 System.out.print("d의 값 : "); int d = scanner.nextInt();
		 
		 System.out.println("세 정수의 최댓값을 구합니다."); 
		 int max = a; 
		 if( b > max ) max = b; 
		 if( c > max ) max = c;
		 System.out.println("최댓값은 "+max+"입니다.");
		 

		System.out.println("4개 정수 최댓값 비교 : " + max4(a, b, c, d));
		System.out.println("3개 정수 최솟값 비교 : " + min3(a, b, c));
		System.out.println("4개 정수 최솟값 비교 : " + min4(a, b, c, d));
	}

	// 4개 정수 최댓값 비교
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	// 3개 정수 최솟값 비교
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;

		return min;
	}

	// 4개 정수 최솟값 비교
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;

		return min;
	}

}
