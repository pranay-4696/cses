import java.util.*;


public class CreatingStrings {
    static List<String> ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int n = arr.length;
        ans = new ArrayList<>();
        solve(0, arr);
        Collections.sort(ans);
        System.out.println(ans.size());
        for(String s : ans) {
            System.out.println(s);
        }
    }


    private static void solve(int id, char[] arr) {
        if(id == arr.length) {
            ans.add(String.valueOf(arr));
            return;
        }
        Set<Character> used = new HashSet<>();
        for(int i = id; i < arr.length; i++) {
            if(used.contains(arr[i]))  continue;
            used.add(arr[i]);
            swap(arr, id, i);
            solve(id+1, arr);
            swap(arr, id, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
