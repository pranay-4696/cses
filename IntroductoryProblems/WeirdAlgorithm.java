import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
 
public class WeirdAlgorithm {
    static BufferedWriter bufferedWriter;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = sc.nextLong();
        solve(n);
        bufferedWriter.flush();
        sc.close();
    }
    public static void solve(long n) throws IOException {
        bufferedWriter.write(n+" ");
        if(n == 1) return;
        if (n % 2 == 0) solve(n / 2);
        else solve(3*n+1);
    }
}