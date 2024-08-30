import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = solve(s);
        System.out.println(result);
    }
    
    static int solve(String s){
        int ans = 0, cnt = 0;
        char prev = ',';
        for(char ch : s.toCharArray()){
            if(ch != prev)
                cnt = 0;
            cnt++;
            prev = ch;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
    
}
