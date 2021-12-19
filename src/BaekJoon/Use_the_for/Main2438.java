package BaekJoon.Use_the_for;

import java.io.*;

public class Main2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bfr.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                bfw.write("*");
            }
            bfw.write("\n");
        }
        bfw.flush();
        bfw.close();
    }
}
