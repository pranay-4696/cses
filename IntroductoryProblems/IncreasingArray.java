import java.util.*;
 
public class IncreasingArray {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println(solve(arr));
    }
    static long solve(int[] arr){
        int n = arr.length;
        long ans = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[i-1]) {
                int d = arr[i-1]-arr[i];
                arr[i] += d;
                ans += d;
            }
        }
        return ans;
    }
}