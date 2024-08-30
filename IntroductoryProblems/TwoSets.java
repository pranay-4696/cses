import java.io.*;
public class TwoSets {
    static BufferedReader br;
    static BufferedWriter bw;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        solve(n);
    }

    private static void solve(int n) throws Exception {
        long sum = n*(n+1)/2;
        if(n % 4 != 0) bw.write("NO SOLUTION\n");
        //Solution exists
        return;
    }
}
