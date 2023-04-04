import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for( int i = 0; i<n; i++ ) {
			int num = scanner.nextInt();
			list.add(num);
		}
		int count = 0;
		int v = scanner.nextInt();
		for( int i : list ) {
			if( i == v ) {
				count++;
			}
		}
		System.out.println( count );
	}
}