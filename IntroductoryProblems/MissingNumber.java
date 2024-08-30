import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for(int i = 0; i < n-1; i++) arr[i] = sc.nextInt();
        long missingNumber = solve(arr, n);
        System.out.println(missingNumber);
    }

    private static long solve(int[] arr, int n) {
        long total = (long)n*(n+1)/2;
        for(int x : arr) total -= x;
        return total;
    }
    
}
