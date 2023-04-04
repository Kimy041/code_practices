import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int v = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for( int i = 0; i<n; i++ ) {
			int num = scanner.nextInt();
			if( num < v ) {
				list.add(num);
			}
		}
		for( int i : list) {
			System.out.print( i +" ");
		}
		
	}
}