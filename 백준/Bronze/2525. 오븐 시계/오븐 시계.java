import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int min = (A*60)+B + C;
		
		int H = min/60;
		int M = min%60;
		
		if( H > 23 ) {
			H -= 24;
		}
			
		System.out.println(H+" "+M);
		
	}
}