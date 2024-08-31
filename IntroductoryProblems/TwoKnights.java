import java.io.*;

public class TwoKnights {
    static BufferedReader br;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            long tot = (i*i)*((i*i)-1);
            tot /= 2;
        }
    }
}
