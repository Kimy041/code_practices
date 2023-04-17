import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        double[] array = new double[n];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {

            double a = Double.parseDouble(st.nextToken());

            if( max < a ) {
                max = a;
            }
            array[i] = a;
        }
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println(sum/max*100/n);
    }
}