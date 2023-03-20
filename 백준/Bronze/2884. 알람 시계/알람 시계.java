import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if( H >= 0 && H <= 23 && M >= 0 && M <= 59  ) {
			if( M >= 45 ) {
				System.out.print( H +" "+(M-45) );
			}else if( H != 0 ) {
				System.out.print( (H-1)+" "+(M+15) );
				
			}else {
				System.out.print( 23+" "+(M+15) );
			}
				
		}
	}
}