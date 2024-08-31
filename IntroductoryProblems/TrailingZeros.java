import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static long solve(int n) {
        long ans = 0;
        while (n > 0) {
            ans += n / 5;
            n = n / 5;
        }
        return ans;
    }
}
