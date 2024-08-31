import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TwoSets {
    static BufferedReader br;
    static BufferedWriter bw;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        solve(n);
        bw.flush();
    }

    private static void solve(int n) throws Exception {
        long sum = (long)n*(n+1)/2;
        if(sum % 2 != 0) {
            bw.write("NO\n");
            return;
        }
        bw.write("YES\n");
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        long k = sum/2;
        int i = 0;
        for(i = n; i >= 1 && k - i >= 0; i--) {
            ls1.add(i);
            k -= i;
        }
        if(k != 0)
            ls1.add((int)k);
        for(int j = 1; j <= i; j++) {
            if(j == k) continue;
            ls2.add(j);
        }
        bw.write(ls1.size()+"\n");
        for(int x : ls1)  bw.write(x+" ");
        bw.write("\n");
        bw.write(ls2.size()+"\n");
        for(int x : ls2)  bw.write(x+" ");
        return;
    }
}
