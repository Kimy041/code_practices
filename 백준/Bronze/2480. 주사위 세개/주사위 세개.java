import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if( A != B && B != C && A != C) {
			int max = A;
			if( B > max ) max = B; 
			if( C > max ) max = C;
			System.out.println( max*100 );
		}else if( A == B && B == C && A == C){
			System.out.println( A*1000+10000 );
		}else {
			if(A == B) {
				System.out.println( A*100+1000 );
			}else if(B == C) {
				System.out.println( B*100+1000 );
			}else if(A == C) {
				System.out.println( C*100+1000 );
			}
		}
		
	}
}