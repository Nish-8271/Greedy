//https://codeforces.com/problemset/problem/1285/B
import java.util.*;
import java.io.*;
public class JustEatIt {
    static JustEatIt.FastReader in;
    static PrintWriter out;

    public static void main(String[] args) throws IOException {
        in = new JustEatIt.FastReader();
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = in.nextInt(); // number of test cases (remove if single test case)
        while (t-- > 0) {
            solve();
        }
//        solve();
        out.flush();
        out.close();
    }

    static void solve() throws IOException {
        int n = in.nextInt();
        int[] arr = new int[n];
        long[] prefix=new long[n+1];
        for (int i = 0; i < n; i++) {
         int temp=in.nextInt();
            arr[i] = temp;
            prefix[i+1]=arr[i]+prefix[i];
        }
        long mx1=Integer.MIN_VALUE,mx2=Integer.MIN_VALUE,mn1=Integer.MAX_VALUE,mn2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mx1=Math.max(mx1,prefix[i]);
            mn1=Math.min(mn1,prefix[i]);
        }
        for(int i=1;i<=n;i++){
            mx2=Math.max(mx2,prefix[i]);
            mn2=Math.min(mn2,prefix[i]);
        }
        if(Math.max((mx1-mn1),(mx2-mn2))< prefix[n])out.println("YES");
        else out.println("NO");
//        out.println(n); // sample output
    }


    // ---------- Fast I/O ----------
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }

        int[] nextIntArray(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = nextInt();
            return arr;
        }

        long[] nextLongArray(int n) throws IOException {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = nextLong();
            return arr;
        }
    }
}
