package contest5Sep;

import java.io.*;
import java.util.StringTokenizer;

public class MooLanguageSchool {

    static MooLanguageSchool.FastReader in;
    static PrintWriter out;

    public static void main(String[] args) throws IOException {
        in = new MooLanguageSchool.FastReader();
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = in.nextInt(); // number of test cases (remove if single test case)
        while (t-- > 0) {
            solve();
        }
        out.flush();
        out.close();
    }

    static void solve() throws IOException {
        int n = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        int k= in.nextInt();
        // ---- your logic here ----
        String nhoj= in.next();
        int ans=0;
       for(int i=0;i<n;i+=k){
           boolean flag=false;
           for(int j=i;j<i+k;j++){
               if(nhoj.charAt(j)=='0') {
                   flag = true;
                   break;
               }
           }
           if(!flag)ans++;
       }
        out.println(ans); // sample output
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
