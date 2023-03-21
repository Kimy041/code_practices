import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m = 0;
		int n = scanner.nextInt();
		
		for( int i = 1 ; i<= n ; i++ ) {
			m+=i;
		}
		System.out.println( m );
	}
}
