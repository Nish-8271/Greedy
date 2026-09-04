import java.util.*;
import java.io.*;

public class StringTransformation {

    static FastReader in;
    static PrintWriter out;

    public static void main(String[] args) throws IOException {

        in = new FastReader();
        out = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(System.out)
                )
        );

        String str = in.nextLine();

        if (str.length() < 26) {
            out.println(-1);
            out.flush();
            return;
        }

        char[] arr = str.toCharArray();

        int need = 0;
        int changes = 0;

        for (int i = 0; i < arr.length && need < 26; i++) {

            if (arr[i] <= ('a' + need)) {

                if (arr[i] != ('a' + need)) {
                    arr[i] = (char) ('a' + need);
                    changes++;
                }

                need++;
            }
        }

        if (need < 26) {
            out.println(-1);
        } else {
            out.println(new String(arr));
        }

        out.flush();
        out.close();
    }

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in)
            );
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }
}