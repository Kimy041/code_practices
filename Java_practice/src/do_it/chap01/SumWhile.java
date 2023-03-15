package do_it.chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값은 :");
		int n = scanner.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while( i <= n ) {
			sum += i;
			i++;
		}
		System.out.println("i의 최종 값 : i = "+i+", n+1 : "+ (n+1) );
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		
	}
}
