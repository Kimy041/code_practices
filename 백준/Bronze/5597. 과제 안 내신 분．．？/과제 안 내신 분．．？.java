import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[31];
		
		for(int i = 0; i<28; i++) {
			int submit = Integer.parseInt(br.readLine());
			array[submit] = 1;
		}
		
		for( int i=1; i<array.length; i++ ) {
			if( array[i] != 1 ) {
				System.out.println( i );
			}
		}
	}
}