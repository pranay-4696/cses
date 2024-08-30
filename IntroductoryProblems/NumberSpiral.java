import java.util.*;
import java.io.*;
public class NumberSpiral {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String[] input = br.readLine().split(" ");
            int y = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            bw.write(solve(y, x)+"\n");
        }
        bw.flush();
    }

    private static long solve(int y, int x) {
        int mx = x > y ? x : y;
        int mn = x < y ? x : y;
        long ans = (long)mx*(mx-1)+1;
        if(y > x) {
            if(y % 2 == 0)  ans = ans + (mx-mn);
            else ans = ans - (mx-mn);
        }
        else {
            if(x % 2 == 1)  ans = ans + (mx-mn);
            else ans = ans - (mx-mn);
        }
        return ans;
    }
}
