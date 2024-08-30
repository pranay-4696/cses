import java.io.*;
import java.util.*;
 
public class Permutaions {
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException{
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
        bw.flush();
    }
    private static void solve(int n) throws IOException {
        if(n==2 || n==3) {
            bw.write("NO SOLUTION");
            return;
        }
        for(int i = 2; i <= n; i += 2) bw.write(i+" ");
        for(int i = 1; i <= n; i += 2) bw.write(i+" ");
    }
}