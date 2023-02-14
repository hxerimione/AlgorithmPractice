package codingtest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = N/3;
        int b = N%3;
        if ((a+b)%2 == 0) System.out.println("CY");
        else System.out.println("SK");
    }
}
