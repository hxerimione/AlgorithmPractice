package codingtest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj16194 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N+1];
        for(int i =1;i<N+1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N+1];
        dp[1] = arr[1];
        for(int i=2;i<N+1;i++){
            dp[i] = arr[i];
            for (int j=0;j<i/2+1;j++){
                dp[i] = Math.min(dp[i], dp[j] + dp[i-j]);
            }
        }
        System.out.println(dp[N]);
    }
}
