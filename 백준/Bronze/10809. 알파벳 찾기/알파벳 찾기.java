import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		int[] array = new int[26];
		for( int i = 0; i<26; i++) {
			array[i] = -1;
		}
		
		for(int i = 0 ; i<S.length(); i++) {
			char ch = S.charAt(i);
			
			if( array[ch-'a'] == -1) {
				array[ch-'a'] = i;
			}
		}
		
		for(int v :array) {
			System.out.print(v +" ");
		}
		
	}
}