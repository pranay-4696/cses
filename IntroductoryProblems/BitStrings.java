import java.util.Scanner;

public class BitStrings {
    static  int mod = (int)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(2, n));
    }

    private static long power(int a, int n) {
        long ans = 1, base = a;
        while(n > 0) {
            if(n % 2 == 1) {
                ans = (ans * base) % mod;
            }
            base = (base * base) % mod;
            n = n / 2;
        }
        return ans;
    }
}
