import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		
		for(int a = 0; a<n; a++) {
			array[a] = a+1;
		}
		for(int b = 0; b<m ; b++) {
			int tmp;
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			tmp = array[i-1];
			array[i-1] = array[j-1];
			array[j-1] = tmp;
			
		}
		br.close();
		
		for( int i=0; i<array.length; i++ ) {
			System.out.print( array[i]+ " " );
		}
	}
}