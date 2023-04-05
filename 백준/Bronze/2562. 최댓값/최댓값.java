import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[9];
		
		for(int i = 0; i<9; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int index = 0;
		int count = 0;
		int max = 0;
		
		for(int v : array) {
			count++;
			if( v > max ) {
				max = v;
				index = count;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}