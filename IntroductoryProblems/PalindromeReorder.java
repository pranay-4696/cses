import java.util.Scanner;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = solve(s);
        System.out.println(ans);
    }

    private static String solve(String s) {
        int n = s.length();
        char[] ans = new char[n];
        int[] count = new int[26];
        for(char ch : s.toCharArray()) {
            count[ch-'A']++;
        }
        char odd_ch = '$';
        for(int idx = 0; idx < count.length; idx++) {
            if(count[idx] % 2 == 1) {
                if (odd_ch != '$') return "NO SOLUTION";
                odd_ch = (char)(idx+'A');
            }
        }
        ans[n/2] = odd_ch;
        for(int idx = 0, i = 0, j = n-1; idx < count.length; idx++) {
            char ch = (char)(idx+'A');
            while(count[idx] > 1) {
                ans[i] = ch;
                ans[j] = ch;
                count[idx] -= 2;
                i++;
                j--;
            }
        }
        return String.valueOf(ans);
    }
}
