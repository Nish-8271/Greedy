package contest5Sep;

import java.io.*;
import java.util.StringTokenizer;

//Group 1: odd numbers
//Group 2: even numbers where x % 4 == 0  [8,4]->[6,2]->[4,0],[2,2]
//Group 3: even numbers where x % 4 == 2  [10,14]->[8,12]
public class MinusTwo {
    static MinusTwo.FastReader in;
    static PrintWriter out;

    public static void main(String[] args) throws IOException {
        in = new MinusTwo.FastReader();
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
        int g1=0;
        int g2=0;
        int g3=0;
        for (int i = 0; i < n; i++) {
            int temp= in.nextInt();
            if(temp%4==2){
                g1++;
            } else if (temp % 4 ==0) {
                g2++;
            }else{
                g3++;
            }
        }

        // ---- your logic here ----

        out.println(Math.max(g1,Math.max(g2,g3))); // sample output
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
