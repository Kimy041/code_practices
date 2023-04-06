import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		
		int m = Integer.parseInt(st.nextToken());
		for(int a = 0; a<m; a++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			for(int b=(i-1); b<j; b++ ) {
				array[b] = k;
			}
		}
		br.close();
		for( int i=0; i<array.length; i++ ) {
			System.out.print( array[i]+ " " );
		}
	}
}