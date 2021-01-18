import java.io.*;
import java.util.*;

class baek__11729 {
    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;

    static void solve(int n, int x, int y) {
        if (n == 1) {
            sb.append(x + " " + y + "\n");
            cnt++;
            return;
        }
        solve(n - 1, x, 6 - x - y);
        sb.append(x + " " + y + "\n");
        cnt++;
        solve(n - 1, 6 - x - y, y);
    }

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        solve(n, 1, 3);
        System.out.println(cnt);
        System.out.print(sb);
    }
}